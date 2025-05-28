package fossils.fossils.client.blockentity.model.diplocaulusminimus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DiplocaulusminimusFossilModel extends SkullModelBase {
	private final ModelPart body;
	private final ModelPart forelegL;
	private final ModelPart forelegL2;
	private final ModelPart forelegL3;
	private final ModelPart forelegL4;
	private final ModelPart forelegL5;
	private final ModelPart forelegL6;
	private final ModelPart neck;
	private final ModelPart wholehead;
	private final ModelPart lowerhead;
	private final ModelPart jaw;
	private final ModelPart upperjaw;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart tail;
	private final ModelPart hindlegL2;
	private final ModelPart hindlegL3;
	private final ModelPart hindlegL7;
	private final ModelPart hindlegL4;
	private final ModelPart hindlegL5;
	private final ModelPart hindlegL6;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;

	public DiplocaulusminimusFossilModel(ModelPart root) {
		this.body = root.getChild("body");
		this.forelegL = this.body.getChild("forelegL");
		this.forelegL2 = this.forelegL.getChild("forelegL2");
		this.forelegL3 = this.forelegL2.getChild("forelegL3");
		this.forelegL4 = this.body.getChild("forelegL4");
		this.forelegL5 = this.forelegL4.getChild("forelegL5");
		this.forelegL6 = this.forelegL5.getChild("forelegL6");
		this.neck = this.body.getChild("neck");
		this.wholehead = this.neck.getChild("wholehead");
		this.lowerhead = this.wholehead.getChild("lowerhead");
		this.jaw = this.lowerhead.getChild("jaw");
		this.upperjaw = this.wholehead.getChild("upperjaw");
		this.bone3 = this.upperjaw.getChild("bone3");
		this.bone4 = this.upperjaw.getChild("bone4");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.tail = this.body4.getChild("tail");
		this.hindlegL2 = this.tail.getChild("hindlegL2");
		this.hindlegL3 = this.hindlegL2.getChild("hindlegL3");
		this.hindlegL7 = this.hindlegL3.getChild("hindlegL7");
		this.hindlegL4 = this.tail.getChild("hindlegL4");
		this.hindlegL5 = this.hindlegL4.getChild("hindlegL5");
		this.hindlegL6 = this.hindlegL5.getChild("hindlegL6");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.0F, -1.0F, 0.0F, 0.0F, -0.8727F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 30).addBox(-1.5F, 1.4F, -1.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -1.372F, -9.2699F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 30).mirror().addBox(-0.5753F, -1.5357F, -0.4755F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1F, -0.072F, -8.7699F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.7986F, -0.7424F, -0.4614F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.828F, -9.2699F, 0.0151F, 0.0802F, 0.4376F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 30).addBox(-0.4247F, -1.5357F, -0.4755F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.1F, -0.072F, -8.7699F, 0.0F, 0.0F, 0.3054F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.2014F, -0.7424F, -0.4614F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8F, 0.828F, -9.2699F, 0.0151F, -0.0802F, -0.4376F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(10, 3).mirror().addBox(-2.8126F, -0.8452F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -1.4807F, -6.8804F, -0.2573F, 0.3175F, -0.7431F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(7, 48).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -1.4807F, -6.8804F, -0.0946F, 0.3954F, -0.2843F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(48, 47).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.2F, -1.6807F, -8.8804F, -0.064F, 0.2947F, -0.2739F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(33, 35).mirror().addBox(-2.8126F, -0.8452F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.2F, -1.6807F, -8.8804F, -0.1845F, 0.2397F, -0.723F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(7, 48).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.3F, -1.4807F, -6.8804F, -0.0946F, -0.3954F, 0.2843F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(10, 3).addBox(1.8126F, -0.8452F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.3F, -1.4807F, -6.8804F, -0.2573F, -0.3175F, 0.7431F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(33, 35).addBox(1.8126F, -0.8452F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2F, -1.6807F, -8.8804F, -0.1845F, -0.2397F, 0.723F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(48, 47).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2F, -1.6807F, -8.8804F, -0.064F, -0.2947F, 0.2739F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(34, 41).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.372F, -9.3699F, 0.0175F, 0.0F, 0.0F));

		PartDefinition forelegL = body.addOrReplaceChild("forelegL", CubeListBuilder.create().texOffs(46, 43).addBox(0.0F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(2.7F, -0.322F, -7.4699F, -0.4547F, -1.1702F, 0.7054F));

		PartDefinition forelegL2 = forelegL.addOrReplaceChild("forelegL2", CubeListBuilder.create().texOffs(28, 41).addBox(0.0F, -0.5F, 0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(46, 17).addBox(0.0F, -0.5F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.65F, 0.5F, 0.2F, 1.1072F, 0.148F, 0.0568F));

		PartDefinition forelegL3 = forelegL2.addOrReplaceChild("forelegL3", CubeListBuilder.create().texOffs(12, 32).addBox(-0.1F, -0.5F, -0.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, 0.0896F, 0.0132F, 0.1732F));

		PartDefinition forelegL4 = body.addOrReplaceChild("forelegL4", CubeListBuilder.create().texOffs(46, 43).mirror().addBox(-3.0F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-2.7F, -0.322F, -7.4699F, -0.3797F, 1.0903F, -0.6225F));

		PartDefinition forelegL5 = forelegL4.addOrReplaceChild("forelegL5", CubeListBuilder.create().texOffs(28, 41).mirror().addBox(-3.0F, -0.5F, 0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(46, 17).mirror().addBox(-3.0F, -0.5F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.65F, 0.5F, 0.2F, 1.1072F, -0.148F, -0.0568F));

		PartDefinition forelegL6 = forelegL5.addOrReplaceChild("forelegL6", CubeListBuilder.create().texOffs(12, 32).mirror().addBox(-2.9F, -0.5F, -0.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, 0.0896F, -0.0132F, -0.1732F));

		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.772F, -8.2699F, -0.1309F, 0.0F, -0.2618F));

		PartDefinition cube_r15 = neck.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(41, 48).mirror().addBox(-1.8F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4564F, -2.5019F, 0.0213F, 0.3166F, -0.2013F));

		PartDefinition cube_r16 = neck.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(41, 48).addBox(-0.2F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4564F, -2.5019F, 0.0213F, -0.3166F, 0.2013F));

		PartDefinition cube_r17 = neck.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(45, 38).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -3.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition wholehead = neck.addOrReplaceChild("wholehead", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -3.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition lowerhead = wholehead.addOrReplaceChild("lowerhead", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9F, -4.8F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r18 = lowerhead.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(42, 0).addBox(-0.1F, -1.25F, 0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.2485F, -2.752F, 0.0F, -0.6109F, 0.0F));

		PartDefinition cube_r19 = lowerhead.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(40, 43).addBox(-0.9F, -1.25F, 0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2485F, -2.752F, 0.0F, 0.6109F, 0.0F));

		PartDefinition jaw = lowerhead.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(0, 39).addBox(-1.0F, 0.0F, -3.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.0015F, 0.948F));

		PartDefinition upperjaw = wholehead.addOrReplaceChild("upperjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -0.25F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r20 = upperjaw.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(10, 0).addBox(-1.3F, -3.0526F, -9.7392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(0, 0).addBox(-1.7F, -2.7526F, -8.5392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(33, 32).addBox(0.3F, -3.0526F, -9.7392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(38, 24).addBox(0.7F, -2.7526F, -8.5392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(19, 32).addBox(-2.0F, -2.6526F, -7.5392F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.01F))
				.texOffs(32, 46).addBox(-1.0F, -2.6526F, -9.5392F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 1.75F, 2.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r21 = upperjaw.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(50, 13).mirror().addBox(-0.3648F, 0.0994F, -0.7182F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.9F, -1.2203F, -2.9405F, -0.0819F, -0.2527F, 0.1558F));

		PartDefinition cube_r22 = upperjaw.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(40, 13).addBox(-5.6352F, 0.0994F, -0.7182F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.9F, -1.2203F, -2.9405F, -0.0819F, 0.2527F, -0.1558F));

		PartDefinition bone3 = upperjaw.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition cube_r23 = bone3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(32, 0).addBox(-0.9965F, -0.8974F, -0.132F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0075F)), PartPose.offsetAndRotation(-0.5541F, -0.1481F, -2.8822F, -0.2558F, -1.3944F, 0.1125F));

		PartDefinition cube_r24 = bone3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(41, 31).addBox(0.1133F, -0.484F, 0.1278F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0075F)), PartPose.offsetAndRotation(-6.0F, 0.1F, -5.4F, -0.0479F, -0.5262F, -0.0982F));

		PartDefinition cube_r25 = bone3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 7).addBox(0.0481F, -0.2436F, -0.2198F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-3.0349F, -0.5918F, -7.4348F, -0.0716F, -0.9531F, -0.0639F));

		PartDefinition cube_r26 = bone3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(14, 23).addBox(0.0835F, -0.5702F, -0.1105F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.0349F, -0.5918F, -9.4348F, -0.0593F, -0.7963F, -0.0799F));

		PartDefinition bone4 = upperjaw.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition cube_r27 = bone4.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(28, 17).addBox(0.9533F, -0.8169F, 3.7405F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0075F))
				.texOffs(17, 39).addBox(0.9533F, -0.8169F, -1.5595F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.9541F, 0.0519F, -2.6822F, -0.0932F, 1.0579F, 0.0456F));

		PartDefinition cube_r28 = bone4.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 17).addBox(-0.0467F, -0.9169F, -1.5595F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0075F)), PartPose.offsetAndRotation(1.9541F, 0.0519F, -2.6822F, -0.1107F, 1.0579F, 0.0456F));

		PartDefinition cube_r29 = bone4.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(40, 17).addBox(-1.0136F, 0.1312F, -0.0847F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0075F)), PartPose.offsetAndRotation(8.8F, 0.1F, -1.2F, -0.0542F, 0.7005F, 0.0873F));

		PartDefinition cube_r30 = bone4.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(14, 17).addBox(-0.9541F, 0.3653F, -0.0121F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(6.4349F, -0.5918F, -4.4348F, -0.0654F, 0.641F, 0.0943F));

		PartDefinition cube_r31 = bone4.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(39, 24).addBox(-3.0481F, -0.2436F, -0.5198F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(3.0349F, -0.5918F, -7.4348F, -0.081F, 0.8673F, 0.0716F));

		PartDefinition cube_r32 = bone4.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 23).addBox(-2.0835F, -0.5702F, -0.1105F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.0349F, -0.5918F, -9.4348F, -0.0593F, 0.7963F, 0.0799F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 39).addBox(-0.5F, -0.7F, -0.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -1.272F, -6.2699F, 0.0873F, 0.0F, 0.0873F));

		PartDefinition cube_r33 = body2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(18, 13).mirror().addBox(-6.0561F, -1.423F, 1.6272F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(32, 9).mirror().addBox(-5.2894F, -1.2155F, -0.2083F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3F, 3.3F, -0.1126F, 0.3934F, -0.6659F));

		PartDefinition cube_r34 = body2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(47, 31).mirror().addBox(-2.477F, -0.6421F, 1.6272F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(48, 0).mirror().addBox(-1.6856F, -0.7094F, -0.2083F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3F, 3.3F, 0.0366F, 0.4068F, -0.2868F));

		PartDefinition cube_r35 = body2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(21, 17).mirror().addBox(-4.2894F, -1.2155F, -0.2083F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3F, 1.3F, -0.1126F, 0.3934F, -0.6659F));

		PartDefinition cube_r36 = body2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-1.6856F, -0.7094F, -0.2083F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3F, 1.3F, 0.0366F, 0.4068F, -0.2868F));

		PartDefinition cube_r37 = body2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(47, 31).addBox(0.477F, -0.6421F, 1.6272F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 0).addBox(-0.3144F, -0.7094F, -0.2083F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, 3.3F, 0.0366F, -0.4068F, 0.2868F));

		PartDefinition cube_r38 = body2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(18, 13).addBox(2.0561F, -1.423F, 1.6272F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 9).addBox(1.2894F, -1.2155F, -0.2083F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, 3.3F, -0.1126F, -0.3934F, 0.6659F));

		PartDefinition cube_r39 = body2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(21, 17).addBox(1.2894F, -1.2155F, -0.2083F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, 1.3F, -0.1126F, -0.3934F, 0.6659F));

		PartDefinition cube_r40 = body2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 48).addBox(-0.3144F, -0.7094F, -0.2083F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, 1.3F, 0.0366F, -0.4068F, 0.2868F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 7.1F, 0.0379F, -0.1327F, 0.044F));

		PartDefinition cube_r41 = body3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(10, 39).addBox(-0.5F, -0.6956F, -1.0999F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.9F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r42 = body3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(-1.7375F, -0.5185F, -0.2377F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3F, 2.2F, 0.0087F, 0.4904F, -0.299F));

		PartDefinition cube_r43 = body3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(41, 36).mirror().addBox(-4.4035F, -1.0539F, -0.2377F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3F, 2.2F, -0.1727F, 0.4614F, -0.6909F));

		PartDefinition cube_r44 = body3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(0, 13).mirror().addBox(-5.3465F, -1.1347F, -0.223F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3F, 0.2F, -0.1362F, 0.4208F, -0.6753F));

		PartDefinition cube_r45 = body3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(25, 47).mirror().addBox(-1.7116F, -0.614F, -0.223F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3F, 0.2F, 0.0257F, 0.4403F, -0.2913F));

		PartDefinition cube_r46 = body3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(41, 36).addBox(1.4035F, -1.0539F, -0.2377F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, 2.2F, -0.1727F, -0.4614F, 0.6909F));

		PartDefinition cube_r47 = body3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(0, 44).addBox(-0.2625F, -0.5185F, -0.2377F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, 2.2F, 0.0087F, -0.4904F, 0.299F));

		PartDefinition cube_r48 = body3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(0, 13).addBox(1.3465F, -1.1347F, -0.223F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, 0.2F, -0.1362F, -0.4208F, 0.6753F));

		PartDefinition cube_r49 = body3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(25, 47).addBox(-0.2884F, -0.614F, -0.223F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, 0.2F, 0.0257F, -0.4403F, 0.2913F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 3.4F));

		PartDefinition cube_r50 = body4.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(0, 17).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.5F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r51 = body4.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(42, 5).mirror().addBox(-4.351F, -1.2809F, 1.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3F, -1.2F, -0.1727F, 0.4614F, -0.6909F));

		PartDefinition cube_r52 = body4.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 42).mirror().addBox(-2.7055F, -0.4078F, 1.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3F, -1.2F, 0.0087F, 0.4904F, -0.299F));

		PartDefinition cube_r53 = body4.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(0, 42).addBox(0.7055F, -0.4078F, 1.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, -1.2F, 0.0087F, -0.4904F, 0.299F));

		PartDefinition cube_r54 = body4.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(42, 5).addBox(2.351F, -1.2809F, 1.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, -1.2F, -0.1727F, -0.4614F, 0.6909F));

		PartDefinition tail = body4.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(31, 32).addBox(-0.5F, -0.6936F, -0.001F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.25F, 2.5F, 0.0295F, -0.1167F, 0.1475F));

		PartDefinition cube_r55 = tail.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(29, 13).mirror().addBox(-1.4943F, -0.3346F, -0.1538F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.05F, 2.3F, 0.0498F, 0.365F, -0.2819F));

		PartDefinition cube_r56 = tail.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(0, 3).mirror().addBox(-2.4606F, -0.9731F, -0.2524F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.05F, 0.3F, -0.1362F, 0.4208F, -0.6753F));

		PartDefinition cube_r57 = tail.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(0, 35).mirror().addBox(-1.7635F, -0.4231F, -0.2524F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.05F, 0.3F, 0.0257F, 0.4403F, -0.2913F));

		PartDefinition cube_r58 = tail.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(29, 13).addBox(-0.5057F, -0.3346F, -0.1538F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.05F, 2.3F, 0.0498F, -0.365F, 0.2819F));

		PartDefinition cube_r59 = tail.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(0, 3).addBox(1.4606F, -0.9731F, -0.2524F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.05F, 0.3F, -0.1362F, -0.4208F, 0.6753F));

		PartDefinition cube_r60 = tail.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(18, 6).mirror().addBox(-1.7F, -1.0104F, -0.1071F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.25F, 1.6F, -0.0403F, 0.0167F, 0.3924F));

		PartDefinition cube_r61 = tail.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(43, 9).mirror().addBox(-1.1F, -0.6F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7165F, 0.6631F, 3.5639F, -0.0057F, 0.0433F, 1.4398F));

		PartDefinition cube_r62 = tail.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(43, 9).addBox(-0.9F, -0.6F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7165F, 0.6631F, 3.5639F, -0.0057F, -0.0433F, -1.4398F));

		PartDefinition cube_r63 = tail.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(18, 6).addBox(-0.3F, -1.0104F, -0.1071F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 2.25F, 1.6F, -0.0403F, -0.0167F, -0.3924F));

		PartDefinition cube_r64 = tail.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(18, 0).addBox(-0.5F, 1.4F, 1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.25F, -0.4F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r65 = tail.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 35).addBox(-0.2365F, -0.4231F, -0.2524F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.05F, 0.3F, 0.0257F, -0.4403F, 0.2913F));

		PartDefinition hindlegL2 = tail.addOrReplaceChild("hindlegL2", CubeListBuilder.create().texOffs(16, 47).addBox(-0.5F, -0.25F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.5F, 0.75F, 3.3F, -0.2587F, -0.6551F, 0.5323F));

		PartDefinition hindlegL3 = hindlegL2.addOrReplaceChild("hindlegL3", CubeListBuilder.create().texOffs(32, 3).addBox(0.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(32, 0).addBox(-0.0702F, -0.5F, 0.0473F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.45F, 0.25F, -0.7F, 0.9615F, -1.0745F, 0.418F));

		PartDefinition hindlegL7 = hindlegL3.addOrReplaceChild("hindlegL7", CubeListBuilder.create().texOffs(28, 24).addBox(0.0F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.9F, 0.0F, 0.0F, -0.036F, -0.1371F, -1.1696F));

		PartDefinition hindlegL4 = tail.addOrReplaceChild("hindlegL4", CubeListBuilder.create().texOffs(16, 47).mirror().addBox(-2.5F, -0.25F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.75F, 3.3F, -0.8036F, 1.2851F, -1.1554F));

		PartDefinition hindlegL5 = hindlegL4.addOrReplaceChild("hindlegL5", CubeListBuilder.create().texOffs(32, 3).mirror().addBox(-2.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(32, 0).mirror().addBox(-1.9298F, -0.5F, 0.0473F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.45F, 0.25F, -0.7F, 1.1982F, 0.7248F, -0.1211F));

		PartDefinition hindlegL6 = hindlegL5.addOrReplaceChild("hindlegL6", CubeListBuilder.create().texOffs(28, 24).mirror().addBox(-3.0F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.0F, 0.0F, -0.0999F, 0.1007F, 0.6435F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(28, 13).addBox(-0.5F, -0.65F, -0.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0436F, 6.999F, 0.104F, -0.1182F, -0.1371F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0625F, 0.0F, 8.8238F, 0.1337F, -0.3487F, -0.0159F));

		PartDefinition cube_r66 = tail3.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(14, 19).addBox(-0.5625F, -0.4F, -0.5F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.25F, 0.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(18, 0).addBox(-0.5625F, -0.5F, 0.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.35F, 10.4F, 0.1459F, 0.2088F, 0.1312F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.593F, -0.5F, -0.25F, 1.0F, 1.0F, 15.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.0305F, 0.0F, 10.9914F, 0.1818F, 0.4675F, 0.1386F));

		return LayerDefinition.create(meshdefinition, 58, 50);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.body.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}