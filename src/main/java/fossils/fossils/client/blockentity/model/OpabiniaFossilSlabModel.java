package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class OpabiniaFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart head;
	private final ModelPart nozzle;
	private final ModelPart nozzle2;
	private final ModelPart nozzle3;
	private final ModelPart nozzle4;
	private final ModelPart nozzle5;
	private final ModelPart nozzle6;
	private final ModelPart nozzle7;
	private final ModelPart jaw;
	private final ModelPart jawL;
	private final ModelPart jawR;
	private final ModelPart middleeye;
	private final ModelPart backeyeR;
	private final ModelPart fronteyeR;
	private final ModelPart segment1;
	private final ModelPart legR1;
	private final ModelPart finR1;
	private final ModelPart segment2;
	private final ModelPart finR2;
	private final ModelPart segment3;
	private final ModelPart finR3;
	private final ModelPart segment4;
	private final ModelPart finR4;
	private final ModelPart segment5;
	private final ModelPart finR5;
	private final ModelPart segment6;
	private final ModelPart legR6;
	private final ModelPart finR6;
	private final ModelPart segment7;
	private final ModelPart finR7;
	private final ModelPart segment8;
	private final ModelPart finR8;
	private final ModelPart segment9;
	private final ModelPart legR9;
	private final ModelPart finR9;
	private final ModelPart segment10;
	private final ModelPart finR10;
	private final ModelPart segment11;
	private final ModelPart legR11;
	private final ModelPart finR11;
	private final ModelPart segment12;
	private final ModelPart legR12;
	private final ModelPart finR12;
	private final ModelPart segment13;
	private final ModelPart legR13;
	private final ModelPart finR13;
	private final ModelPart segment14;
	private final ModelPart legR14;
	private final ModelPart finR14;
	private final ModelPart segment15;
	private final ModelPart legR15;
	private final ModelPart finR15;
	private final ModelPart tail;
	private final ModelPart tailfinR1;
	private final ModelPart tailfinR2;
	private final ModelPart tailfinL3;
	private final ModelPart tailfinR3;

	public OpabiniaFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.head = this.fossil.getChild("head");
		this.nozzle = this.head.getChild("nozzle");
		this.nozzle2 = this.nozzle.getChild("nozzle2");
		this.nozzle3 = this.nozzle2.getChild("nozzle3");
		this.nozzle4 = this.nozzle3.getChild("nozzle4");
		this.nozzle5 = this.nozzle4.getChild("nozzle5");
		this.nozzle6 = this.nozzle5.getChild("nozzle6");
		this.nozzle7 = this.nozzle6.getChild("nozzle7");
		this.jaw = this.nozzle7.getChild("jaw");
		this.jawL = this.jaw.getChild("jawL");
		this.jawR = this.jaw.getChild("jawR");
		this.middleeye = this.head.getChild("middleeye");
		this.backeyeR = this.head.getChild("backeyeR");
		this.fronteyeR = this.head.getChild("fronteyeR");
		this.segment1 = this.head.getChild("segment1");
		this.legR1 = this.segment1.getChild("legR1");
		this.finR1 = this.segment1.getChild("finR1");
		this.segment2 = this.segment1.getChild("segment2");
		this.finR2 = this.segment2.getChild("finR2");
		this.segment3 = this.segment2.getChild("segment3");
		this.finR3 = this.segment3.getChild("finR3");
		this.segment4 = this.segment3.getChild("segment4");
		this.finR4 = this.segment4.getChild("finR4");
		this.segment5 = this.segment4.getChild("segment5");
		this.finR5 = this.segment5.getChild("finR5");
		this.segment6 = this.segment5.getChild("segment6");
		this.legR6 = this.segment6.getChild("legR6");
		this.finR6 = this.segment6.getChild("finR6");
		this.segment7 = this.segment6.getChild("segment7");
		this.finR7 = this.segment7.getChild("finR7");
		this.segment8 = this.segment7.getChild("segment8");
		this.finR8 = this.segment8.getChild("finR8");
		this.segment9 = this.segment8.getChild("segment9");
		this.legR9 = this.segment9.getChild("legR9");
		this.finR9 = this.segment9.getChild("finR9");
		this.segment10 = this.segment9.getChild("segment10");
		this.finR10 = this.segment10.getChild("finR10");
		this.segment11 = this.segment10.getChild("segment11");
		this.legR11 = this.segment11.getChild("legR11");
		this.finR11 = this.segment11.getChild("finR11");
		this.segment12 = this.segment11.getChild("segment12");
		this.legR12 = this.segment12.getChild("legR12");
		this.finR12 = this.segment12.getChild("finR12");
		this.segment13 = this.segment12.getChild("segment13");
		this.legR13 = this.segment13.getChild("legR13");
		this.finR13 = this.segment13.getChild("finR13");
		this.segment14 = this.segment13.getChild("segment14");
		this.legR14 = this.segment14.getChild("legR14");
		this.finR14 = this.segment14.getChild("finR14");
		this.segment15 = this.segment14.getChild("segment15");
		this.legR15 = this.segment15.getChild("legR15");
		this.finR15 = this.segment15.getChild("finR15");
		this.tail = this.segment15.getChild("tail");
		this.tailfinR1 = this.tail.getChild("tailfinR1");
		this.tailfinR2 = this.tail.getChild("tailfinR2");
		this.tailfinL3 = this.tail.getChild("tailfinL3");
		this.tailfinR3 = this.tail.getChild("tailfinR3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offsetAndRotation(0.153F, 23.5F, -1.2456F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-9.5F, -0.5F, -15.5F, 21.0F, 1.0F, 33.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.653F, 0.0F, -1.2544F, 0.0F, -0.3054F, 0.0F));

		PartDefinition head = fossil.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 4).addBox(0.675F, -1.5166F, -1.6099F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.652F, -1.2434F, 5.8555F, 2.9234F, 0.0F, 1.5708F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(10, 18).addBox(0.67F, 0.85F, -6.25F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, 1.7434F, 5.3901F, -0.48F, 0.0F, 0.0F));

		PartDefinition nozzle = head.addOrReplaceChild("nozzle", CubeListBuilder.create().texOffs(26, 24).addBox(0.7F, -0.501F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, -0.0066F, -1.1099F, 0.4363F, 0.0F, 0.0F));

		PartDefinition nozzle2 = nozzle.addOrReplaceChild("nozzle2", CubeListBuilder.create().texOffs(26, 21).addBox(0.71F, -0.501F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition nozzle3 = nozzle2.addOrReplaceChild("nozzle3", CubeListBuilder.create().texOffs(21, 26).addBox(0.7F, -0.501F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition nozzle4 = nozzle3.addOrReplaceChild("nozzle4", CubeListBuilder.create().texOffs(26, 15).addBox(0.71F, -0.501F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition nozzle5 = nozzle4.addOrReplaceChild("nozzle5", CubeListBuilder.create().texOffs(15, 26).addBox(0.7F, -0.501F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition nozzle6 = nozzle5.addOrReplaceChild("nozzle6", CubeListBuilder.create().texOffs(26, 12).addBox(0.71F, -0.501F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition nozzle7 = nozzle6.addOrReplaceChild("nozzle7", CubeListBuilder.create().texOffs(12, 26).addBox(0.7F, -0.501F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, -0.48F, 0.0F, 0.0F));

		PartDefinition jaw = nozzle7.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -1.0F));

		PartDefinition jawL = jaw.addOrReplaceChild("jawL", CubeListBuilder.create().texOffs(5, 16).addBox(0.7F, -1.0F, -2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition jawR = jaw.addOrReplaceChild("jawR", CubeListBuilder.create().texOffs(0, 16).addBox(0.69F, -1.0F, -2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition middleeye = head.addOrReplaceChild("middleeye", CubeListBuilder.create().texOffs(9, 26).addBox(0.7F, -1.1F, -0.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.005F, -1.2566F, -0.1599F));

		PartDefinition backeyeR = head.addOrReplaceChild("backeyeR", CubeListBuilder.create().texOffs(18, 24).addBox(0.52F, -2.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.145F, -0.8066F, -0.2099F, -0.1745F, 0.0F, 0.0F));

		PartDefinition fronteyeR = head.addOrReplaceChild("fronteyeR", CubeListBuilder.create().texOffs(26, 2).addBox(0.52F, -0.5F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.145F, -1.1066F, -0.9599F, -0.4363F, 0.0F, 0.0F));

		PartDefinition segment1 = head.addOrReplaceChild("segment1", CubeListBuilder.create().texOffs(24, 9).addBox(0.7F, -0.75F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, -0.7566F, 1.3901F, 0.1745F, 0.0F, 0.0F));

		PartDefinition legR1 = segment1.addOrReplaceChild("legR1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7F, 0.75F, -0.1F, -1.5708F, -1.0908F, 1.5708F));

		PartDefinition cube_r3 = legR1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(25, 18).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition finR1 = segment1.addOrReplaceChild("finR1", CubeListBuilder.create().texOffs(17, 13).addBox(-1.55F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.5F, 0.5F, 0.0F, -0.3927F, -1.5708F));

		PartDefinition segment2 = segment1.addOrReplaceChild("segment2", CubeListBuilder.create().texOffs(24, 5).addBox(0.71F, -0.76F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition finR2 = segment2.addOrReplaceChild("finR2", CubeListBuilder.create().texOffs(15, 7).addBox(-2.4995F, 1.67F, -0.4782F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.5F, 0.5F, 0.0F, 0.0F, -1.5708F));

		PartDefinition segment3 = segment2.addOrReplaceChild("segment3", CubeListBuilder.create().texOffs(23, 20).addBox(0.7F, -0.75F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition finR3 = segment3.addOrReplaceChild("finR3", CubeListBuilder.create().texOffs(15, 0).addBox(-2.7481F, 1.67F, -0.5436F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.5F, 0.5F, 0.0F, 0.0F, -1.5708F));

		PartDefinition segment4 = segment3.addOrReplaceChild("segment4", CubeListBuilder.create().texOffs(23, 14).addBox(0.71F, -0.76F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition finR4 = segment4.addOrReplaceChild("finR4", CubeListBuilder.create().texOffs(9, 14).addBox(-2.9481F, 1.67F, -0.5436F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.5F, 0.5F, 0.0F, 0.0F, -1.5708F));

		PartDefinition segment5 = segment4.addOrReplaceChild("segment5", CubeListBuilder.create().texOffs(15, 22).addBox(0.7F, -0.75F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition finR5 = segment5.addOrReplaceChild("finR5", CubeListBuilder.create().texOffs(0, 14).addBox(-3.0481F, 1.67F, -0.5436F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.5F, 0.5F, 0.0F, 0.0F, -1.5708F));

		PartDefinition segment6 = segment5.addOrReplaceChild("segment6", CubeListBuilder.create().texOffs(12, 22).addBox(0.71F, -0.76F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition legR6 = segment6.addOrReplaceChild("legR6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.75F, 0.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r4 = legR6.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(6, 25).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -1.2F, 0.0F, 3.1416F, 0.0F));

		PartDefinition finR6 = segment6.addOrReplaceChild("finR6", CubeListBuilder.create().texOffs(13, 4).addBox(-3.2481F, 1.67F, -0.5436F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.5F, 0.5F, 0.0F, 0.0F, -1.5708F));

		PartDefinition segment7 = segment6.addOrReplaceChild("segment7", CubeListBuilder.create().texOffs(9, 22).addBox(0.7F, -0.75F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition finR7 = segment7.addOrReplaceChild("finR7", CubeListBuilder.create().texOffs(9, 12).addBox(-2.9924F, 0.07F, -0.5868F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.9F, 0.5F, 0.0F, -0.0436F, -1.5708F));

		PartDefinition segment8 = segment7.addOrReplaceChild("segment8", CubeListBuilder.create().texOffs(22, 2).addBox(0.71F, -0.76F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition finR8 = segment8.addOrReplaceChild("finR8", CubeListBuilder.create().texOffs(0, 12).addBox(-3.3424F, 1.67F, -0.5868F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.5F, 0.5F, 0.0F, 0.0F, -1.5708F));

		PartDefinition segment9 = segment8.addOrReplaceChild("segment9", CubeListBuilder.create().texOffs(20, 21).addBox(0.7F, -0.75F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition legR9 = segment9.addOrReplaceChild("legR9", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.75F, 0.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r5 = legR9.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(3, 25).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -1.2F, 0.0F, 3.1416F, 0.0F));

		PartDefinition finR9 = segment9.addOrReplaceChild("finR9", CubeListBuilder.create().texOffs(9, 10).addBox(-3.2424F, 1.67F, -0.5868F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.5F, 0.5F, 0.0F, 0.0F, -1.5708F));

		PartDefinition segment10 = segment9.addOrReplaceChild("segment10", CubeListBuilder.create().texOffs(21, 17).addBox(0.71F, -0.76F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition finR10 = segment10.addOrReplaceChild("finR10", CubeListBuilder.create().texOffs(0, 10).addBox(-3.0769F, 1.67F, -0.6504F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.5F, 0.5F, 0.0F, 0.0F, -1.5708F));

		PartDefinition segment11 = segment10.addOrReplaceChild("segment11", CubeListBuilder.create().texOffs(6, 21).addBox(0.7F, -0.75F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition legR11 = segment11.addOrReplaceChild("legR11", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.75F, 0.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r6 = legR11.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 25).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -1.2F, 0.0F, 3.1416F, 0.0F));

		PartDefinition finR11 = segment11.addOrReplaceChild("finR11", CubeListBuilder.create().texOffs(9, 2).addBox(-2.8269F, 1.67F, -0.6504F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.5F, 0.5F, 0.0F, 0.0F, -1.5708F));

		PartDefinition segment12 = segment11.addOrReplaceChild("segment12", CubeListBuilder.create().texOffs(3, 21).addBox(0.71F, -0.76F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition legR12 = segment12.addOrReplaceChild("legR12", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.75F, 0.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r7 = legR12.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(23, 24).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -1.2F, 0.0F, 3.1416F, 0.0F));

		PartDefinition finR12 = segment12.addOrReplaceChild("finR12", CubeListBuilder.create().texOffs(17, 11).addBox(-2.4532F, 1.67F, -0.7113F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.5F, 0.5F, 0.0F, 0.0F, -1.5708F));

		PartDefinition segment13 = segment12.addOrReplaceChild("segment13", CubeListBuilder.create().texOffs(0, 21).addBox(0.7F, -0.75F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition legR13 = segment13.addOrReplaceChild("legR13", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.75F, 0.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r8 = legR13.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(24, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -1.2F, 0.0F, 3.1416F, 0.0F));

		PartDefinition finR13 = segment13.addOrReplaceChild("finR13", CubeListBuilder.create().texOffs(17, 9).addBox(-2.1596F, 1.67F, -0.7868F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.5F, 0.5F, 0.0F, 0.0F, -1.5708F));

		PartDefinition segment14 = segment13.addOrReplaceChild("segment14", CubeListBuilder.create().texOffs(18, 18).addBox(0.71F, -0.76F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition legR14 = segment14.addOrReplaceChild("legR14", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.75F, 0.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r9 = legR14.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 4).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -1.2F, 0.0F, 3.1416F, 0.0F));

		PartDefinition finR14 = segment14.addOrReplaceChild("finR14", CubeListBuilder.create().texOffs(15, 16).addBox(-1.8686F, 1.67F, -0.8378F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.5F, 0.5F, 0.0F, 0.0F, -1.5708F));

		PartDefinition segment15 = segment14.addOrReplaceChild("segment15", CubeListBuilder.create().texOffs(15, 18).addBox(0.7F, -0.75F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition legR15 = segment15.addOrReplaceChild("legR15", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.75F, 0.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r10 = legR15.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -1.23F, 0.0F, 3.1416F, 0.0F));

		PartDefinition finR15 = segment15.addOrReplaceChild("finR15", CubeListBuilder.create().texOffs(8, 16).addBox(-1.5878F, 1.67F, -0.8686F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.5F, 0.5F, 0.0F, 0.0F, -1.5708F));

		PartDefinition tail = segment15.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.21F, -1.25F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6F, 2.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition tailfinR1 = tail.addOrReplaceChild("tailfinR1", CubeListBuilder.create().texOffs(7, 8).addBox(-2.4245F, 0.9962F, -0.2064F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -0.75F, -1.0F));

		PartDefinition tailfinR2 = tail.addOrReplaceChild("tailfinR2", CubeListBuilder.create().texOffs(7, 6).addBox(-2.3578F, 0.9848F, -0.1504F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.85F, 0.2F, 0.0F, 0.4363F, 0.0F));

		PartDefinition tailfinL3 = tail.addOrReplaceChild("tailfinL3", CubeListBuilder.create().texOffs(6, 0).addBox(-0.671F, 0.9397F, 0.0462F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.65F, 1.25F, -2.7053F, -1.5708F, 2.7489F));

		PartDefinition tailfinR3 = tail.addOrReplaceChild("tailfinR3", CubeListBuilder.create().texOffs(4, 4).addBox(-2.5F, 0.0F, -0.25F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3F, 0.15F, 0.95F, 0.0F, 0.8727F, 0.0F));

		return LayerDefinition.create(meshdefinition, 112, 112);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F) + 1.5708F;
	}
}