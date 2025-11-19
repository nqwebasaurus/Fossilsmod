package fossils.fossils.client.blockentity.model.yuxisaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class YuxisaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart rightLeg6;
	private final ModelPart rightLeg7;
	private final ModelPart rightLeg8;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg5;
	private final ModelPart rightLeg9;
	private final ModelPart rightLeg10;
	private final ModelPart chestOsteoderms4;
	private final ModelPart chestOsteoderms15;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart tail;
	private final ModelPart tail6;
	private final ModelPart chestOsteoderms6;
	private final ModelPart chestOsteoderms17;
	private final ModelPart tail2;
	private final ModelPart chestOsteoderms7;
	private final ModelPart chestOsteoderms18;
	private final ModelPart tail3;
	private final ModelPart chestOsteoderms8;
	private final ModelPart chestOsteoderms19;
	private final ModelPart tail4;
	private final ModelPart chestOsteoderms9;
	private final ModelPart chestOsteoderms20;
	private final ModelPart tail5;
	private final ModelPart tail7;
	private final ModelPart chestOsteoderms11;
	private final ModelPart chestOsteoderms22;
	private final ModelPart chestOsteoderms10;
	private final ModelPart chestOsteoderms21;
	private final ModelPart chestOsteoderms5;
	private final ModelPart chestOsteoderms16;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart chestOsteoderms2;
	private final ModelPart chestOsteoderms13;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart rightArm5;
	private final ModelPart rightArm6;
	private final ModelPart rightArm;
	private final ModelPart leftArm5;
	private final ModelPart leftArm6;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart chestOsteoderms;
	private final ModelPart chestOsteoderms12;
	private final ModelPart neck;
	private final ModelPart bipartiteOsteoderm3;
	private final ModelPart bipartiteOsteoderm6;
	private final ModelPart neck2;
	private final ModelPart bipartiteOsteoderm2;
	private final ModelPart bipartiteOsteoderm5;
	private final ModelPart neck3;
	private final ModelPart bipartiteOsteoderm;
	private final ModelPart bipartiteOsteoderm4;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Jaw;
	private final ModelPart chestOsteoderms3;
	private final ModelPart chestOsteoderms14;

	public YuxisaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.rightLeg6 = this.leftLeg.getChild("rightLeg6");
		this.rightLeg7 = this.rightLeg6.getChild("rightLeg7");
		this.rightLeg8 = this.rightLeg7.getChild("rightLeg8");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg5 = this.rightLeg.getChild("rightLeg5");
		this.rightLeg9 = this.rightLeg5.getChild("rightLeg9");
		this.rightLeg10 = this.rightLeg9.getChild("rightLeg10");
		this.chestOsteoderms4 = this.hips.getChild("chestOsteoderms4");
		this.chestOsteoderms15 = this.hips.getChild("chestOsteoderms15");
		this.bone = this.hips.getChild("bone");
		this.bone4 = this.hips.getChild("bone4");
		this.tail = this.hips.getChild("tail");
		this.tail6 = this.tail.getChild("tail6");
		this.chestOsteoderms6 = this.tail6.getChild("chestOsteoderms6");
		this.chestOsteoderms17 = this.tail6.getChild("chestOsteoderms17");
		this.tail2 = this.tail6.getChild("tail2");
		this.chestOsteoderms7 = this.tail2.getChild("chestOsteoderms7");
		this.chestOsteoderms18 = this.tail2.getChild("chestOsteoderms18");
		this.tail3 = this.tail2.getChild("tail3");
		this.chestOsteoderms8 = this.tail3.getChild("chestOsteoderms8");
		this.chestOsteoderms19 = this.tail3.getChild("chestOsteoderms19");
		this.tail4 = this.tail3.getChild("tail4");
		this.chestOsteoderms9 = this.tail4.getChild("chestOsteoderms9");
		this.chestOsteoderms20 = this.tail4.getChild("chestOsteoderms20");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail7 = this.tail5.getChild("tail7");
		this.chestOsteoderms11 = this.tail7.getChild("chestOsteoderms11");
		this.chestOsteoderms22 = this.tail7.getChild("chestOsteoderms22");
		this.chestOsteoderms10 = this.tail5.getChild("chestOsteoderms10");
		this.chestOsteoderms21 = this.tail5.getChild("chestOsteoderms21");
		this.chestOsteoderms5 = this.tail.getChild("chestOsteoderms5");
		this.chestOsteoderms16 = this.tail.getChild("chestOsteoderms16");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.chestOsteoderms2 = this.body2.getChild("chestOsteoderms2");
		this.chestOsteoderms13 = this.body2.getChild("chestOsteoderms13");
		this.chest = this.body2.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.rightArm5 = this.leftArm.getChild("rightArm5");
		this.rightArm6 = this.rightArm5.getChild("rightArm6");
		this.rightArm = this.chest.getChild("rightArm");
		this.leftArm5 = this.rightArm.getChild("leftArm5");
		this.leftArm6 = this.leftArm5.getChild("leftArm6");
		this.bone2 = this.chest.getChild("bone2");
		this.bone3 = this.chest.getChild("bone3");
		this.chestOsteoderms = this.chest.getChild("chestOsteoderms");
		this.chestOsteoderms12 = this.chest.getChild("chestOsteoderms12");
		this.neck = this.chest.getChild("neck");
		this.bipartiteOsteoderm3 = this.neck.getChild("bipartiteOsteoderm3");
		this.bipartiteOsteoderm6 = this.neck.getChild("bipartiteOsteoderm6");
		this.neck2 = this.neck.getChild("neck2");
		this.bipartiteOsteoderm2 = this.neck2.getChild("bipartiteOsteoderm2");
		this.bipartiteOsteoderm5 = this.neck2.getChild("bipartiteOsteoderm5");
		this.neck3 = this.neck2.getChild("neck3");
		this.bipartiteOsteoderm = this.neck3.getChild("bipartiteOsteoderm");
		this.bipartiteOsteoderm4 = this.neck3.getChild("bipartiteOsteoderm4");
		this.head = this.neck3.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.Jaw = this.head.getChild("Jaw");
		this.chestOsteoderms3 = this.body.getChild("chestOsteoderms3");
		this.chestOsteoderms14 = this.body.getChild("chestOsteoderms14");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -21.8F, -0.4F, 1.0F, 22.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -3.65F, -0.5F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-2.3F, -13.35F, -20.5F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-2.15F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.3F, -13.35F, -20.5F, -0.3054F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(4.9F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -15.0F, 0.1F, 0.0F, 0.0F, -1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -24.1002F, -2.9913F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(21, 0).addBox(-0.5F, 2.1F, -1.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, 2.9305F, 3.3993F, -0.6545F, 0.0F, 0.0F));

		PartDefinition rightLeg6 = leftLeg.addOrReplaceChild("rightLeg6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 11.074F, 2.9982F, 1.0472F, 0.0F, 0.0F));

		PartDefinition rightLeg7 = rightLeg6.addOrReplaceChild("rightLeg7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 9.1348F, 0.9443F, -1.3963F, 0.0F, 0.0F));

		PartDefinition rightLeg8 = rightLeg7.addOrReplaceChild("rightLeg8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.9609F, 0.1467F, 0.9599F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 2.9305F, 3.3993F, -0.0436F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 11.074F, 2.9982F, 0.7854F, 0.0F, 0.0F));

		PartDefinition rightLeg9 = rightLeg5.addOrReplaceChild("rightLeg9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 9.1348F, 0.9443F, -0.8727F, 0.0F, 0.0F));

		PartDefinition rightLeg10 = rightLeg9.addOrReplaceChild("rightLeg10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.9609F, 0.1467F, 0.1309F, 0.0F, 0.0F));

		PartDefinition chestOsteoderms4 = hips.addOrReplaceChild("chestOsteoderms4", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2543F, 3.218F, 1.7462F, -0.1311F, -0.0872F, 0.0038F));

		PartDefinition chestOsteoderms15 = hips.addOrReplaceChild("chestOsteoderms15", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2543F, 3.218F, 1.7462F, -0.1311F, 0.0872F, -0.0038F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.0F, 0.0F, 0.0F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-1.0F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 60).addBox(-0.5F, 0.3917F, -0.1123F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.3919F, 7.6908F, -0.1906F, -0.1453F, -0.0602F));

		PartDefinition tail6 = tail.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(68, 60).addBox(-0.5F, 0.45F, -0.35F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(72, 64).addBox(-0.5F, 0.45F, 4.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0583F, 5.9377F, -0.0792F, -0.1305F, 0.0103F));

		PartDefinition chestOsteoderms6 = tail6.addOrReplaceChild("chestOsteoderms6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2602F, -2.1277F, 3.8404F, -0.0438F, -0.0872F, 0.0038F));

		PartDefinition chestOsteoderms17 = tail6.addOrReplaceChild("chestOsteoderms17", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2602F, -2.1277F, 3.8404F, -0.0438F, 0.0872F, -0.0038F));

		PartDefinition tail2 = tail6.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 30).addBox(-0.5F, 0.5306F, -0.0676F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1411F, 5.0543F, 0.0089F, -0.1745F, 0.0421F));

		PartDefinition chestOsteoderms7 = tail2.addOrReplaceChild("chestOsteoderms7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3237F, -1.9952F, 5.4673F, -0.0438F, -0.0872F, 0.0038F));

		PartDefinition chestOsteoderms18 = tail2.addOrReplaceChild("chestOsteoderms18", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3237F, -1.9952F, 5.4673F, -0.0438F, 0.0872F, -0.0038F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(21, 11).addBox(-0.5F, 0.38F, -0.4861F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F))
				.texOffs(29, 19).addBox(-0.5F, 0.38F, 8.2139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1683F, 7.9852F, 0.0264F, -0.1309F, -0.0034F));

		PartDefinition chestOsteoderms8 = tail3.addOrReplaceChild("chestOsteoderms8", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9774F, -1.8376F, 4.9464F, -0.0438F, -0.0872F, 0.0038F));

		PartDefinition chestOsteoderms19 = tail3.addOrReplaceChild("chestOsteoderms19", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9774F, -1.8376F, 4.9464F, -0.0438F, 0.0872F, -0.0038F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(19, 33).addBox(-0.5F, 0.2107F, 0.0313F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1498F, 8.7895F, -0.0162F, -0.2417F, 0.0325F));

		PartDefinition chestOsteoderms9 = tail4.addOrReplaceChild("chestOsteoderms9", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6398F, -1.1576F, 3.699F, -0.0438F, -0.0872F, 0.0038F));

		PartDefinition chestOsteoderms20 = tail4.addOrReplaceChild("chestOsteoderms20", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6398F, -1.1576F, 3.699F, -0.0438F, 0.0872F, -0.0038F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(67, 68).addBox(-0.5F, -0.001F, -0.2135F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2167F, 7.9255F, -0.0565F, -0.2077F, -0.1367F));

		PartDefinition tail7 = tail5.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(19, 52).addBox(-0.5F, 0.15F, -0.45F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.151F, 4.9365F, -0.2314F, -0.3416F, 0.0729F));

		PartDefinition chestOsteoderms11 = tail7.addOrReplaceChild("chestOsteoderms11", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3893F, -0.4282F, 3.9042F, -0.0438F, -0.0872F, 0.0038F));

		PartDefinition chestOsteoderms22 = tail7.addOrReplaceChild("chestOsteoderms22", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3893F, -0.4282F, 3.9042F, -0.0438F, 0.0872F, -0.0038F));

		PartDefinition chestOsteoderms10 = tail5.addOrReplaceChild("chestOsteoderms10", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3893F, -1.0006F, 4.3327F, -0.0438F, -0.0872F, 0.0038F));

		PartDefinition chestOsteoderms21 = tail5.addOrReplaceChild("chestOsteoderms21", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3893F, -1.0006F, 4.3327F, -0.0438F, 0.0872F, -0.0038F));

		PartDefinition chestOsteoderms5 = tail.addOrReplaceChild("chestOsteoderms5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7831F, -2.147F, 3.7935F, -0.0438F, -0.0872F, 0.0038F));

		PartDefinition chestOsteoderms16 = tail.addOrReplaceChild("chestOsteoderms16", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7831F, -2.147F, 3.7935F, -0.0438F, 0.0872F, -0.0038F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8F, -1.0F, 0.0964F, 0.0869F, 0.0084F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(36, 53).addBox(-1.0F, 0.692F, 0.3135F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.7F, -7.2F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.1F, -6.9F, -0.0349F, 0.0436F, -0.0015F));

		PartDefinition cube_r6 = body2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(63, 4).addBox(-1.0F, 3.6F, 5.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(59, 0).addBox(-1.0F, 3.6F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.3F, -7.0F, 0.1833F, 0.0F, 0.0F));

		PartDefinition chestOsteoderms2 = body2.addOrReplaceChild("chestOsteoderms2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3392F, -1.056F, -4.0872F, -0.0874F, -0.0872F, 0.0038F));

		PartDefinition chestOsteoderms13 = body2.addOrReplaceChild("chestOsteoderms13", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3392F, -1.056F, -4.0872F, -0.0874F, 0.0872F, -0.0038F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.9F, -6.0F, 0.0438F, 0.0872F, 0.0038F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(38, 33).addBox(-0.5F, -0.3011F, -0.2163F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.9F, -7.4F, 0.2967F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.1937F, 6.9312F, -4.7113F, 0.3142F, 0.0F, -0.2618F));

		PartDefinition rightArm5 = leftArm.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6751F, 6.9378F, -0.4968F, -1.6498F, 0.6004F, -1.4279F));

		PartDefinition rightArm6 = rightArm5.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1406F, 6.0503F, -0.4855F, 1.6318F, -0.0271F, -1.062F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.1937F, 6.9312F, -4.7113F, 1.0501F, -0.045F, 0.258F));

		PartDefinition leftArm5 = rightArm.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6751F, 6.9378F, -0.4968F, -1.6389F, -0.4251F, 1.4F));

		PartDefinition leftArm6 = leftArm5.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1406F, 6.0503F, -0.4855F, 1.5334F, 0.0553F, -0.4233F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(3.9F, 6.1F, -5.8F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-3.9F, 6.1F, -5.8F));

		PartDefinition chestOsteoderms = chest.addOrReplaceChild("chestOsteoderms", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6399F, -0.2395F, -3.9249F, 0.0873F, 0.0F, 0.0F));

		PartDefinition chestOsteoderms12 = chest.addOrReplaceChild("chestOsteoderms12", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6399F, -0.2395F, -3.9249F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.4992F, -7.5174F, -0.0869F, 0.1741F, -0.0169F));

		PartDefinition cube_r8 = neck.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(63, 89).addBox(-0.5F, -0.3F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(61, 87).addBox(-0.5F, -0.3F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1504F, -2.9367F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bipartiteOsteoderm3 = neck.addOrReplaceChild("bipartiteOsteoderm3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3689F, -1.9711F, -2.2794F, 0.0175F, 0.0F, 0.0F));

		PartDefinition bipartiteOsteoderm6 = neck.addOrReplaceChild("bipartiteOsteoderm6", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3689F, -1.9711F, -2.2794F, 0.0175F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3504F, -2.7541F, -0.3486F, 0.1322F, 0.0339F));

		PartDefinition cube_r9 = neck2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(70, 87).addBox(-0.5F, -0.3123F, -0.0426F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.2063F, -2.6773F, 0.2443F, 0.0F, 0.0F));

		PartDefinition bipartiteOsteoderm2 = neck2.addOrReplaceChild("bipartiteOsteoderm2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3689F, -0.6444F, -3.0332F, 0.3403F, 0.0F, 0.0F));

		PartDefinition bipartiteOsteoderm5 = neck2.addOrReplaceChild("bipartiteOsteoderm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3689F, -0.6444F, -3.0332F, 0.3403F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6866F, -2.6915F, 0.4854F, 0.2327F, 0.1211F));

		PartDefinition cube_r10 = neck3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(29, 79).addBox(-0.5F, 0.5155F, -0.1812F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.2788F, -3.2544F, -0.2967F, 0.0F, 0.0F));

		PartDefinition bipartiteOsteoderm = neck3.addOrReplaceChild("bipartiteOsteoderm", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5144F, -1.6796F, -1.8258F, -0.2182F, 0.0F, 0.0F));

		PartDefinition bipartiteOsteoderm4 = neck3.addOrReplaceChild("bipartiteOsteoderm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5144F, -1.6796F, -1.8258F, -0.2182F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9795F, -3.1718F, 0.2618F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.0F, -1.5201F, -4.3492F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.0F, -1.5201F, -4.3492F));

		PartDefinition Jaw = head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.449F, -0.0373F, 0.6458F, 0.0F, 0.0F));

		PartDefinition chestOsteoderms3 = body.addOrReplaceChild("chestOsteoderms3", CubeListBuilder.create(), PartPose.offsetAndRotation(3.779F, 1.1316F, -3.2448F, -0.1311F, -0.0872F, 0.0038F));

		PartDefinition chestOsteoderms14 = body.addOrReplaceChild("chestOsteoderms14", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.779F, 1.1316F, -3.2448F, -0.1311F, 0.0872F, -0.0038F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}