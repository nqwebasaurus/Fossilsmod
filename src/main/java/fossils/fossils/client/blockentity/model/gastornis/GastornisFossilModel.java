package fossils.fossils.client.blockentity.model.gastornis;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class GastornisFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart toe;
	private final ModelPart leftFoot;
	private final ModelPart leftToes;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart toe2;
	private final ModelPart rightFoot;
	private final ModelPart rightToes;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart neck6;
	private final ModelPart neck5;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public GastornisFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg1 = this.hips.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.toe = this.leftLeg3.getChild("toe");
		this.leftFoot = this.leftLeg3.getChild("leftFoot");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.rightLeg1 = this.hips.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.toe2 = this.rightLeg3.getChild("toe2");
		this.rightFoot = this.rightLeg3.getChild("rightFoot");
		this.rightToes = this.rightFoot.getChild("rightToes");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm1 = this.chest.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.rightArm1 = this.chest.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.neck6 = this.chest.getChild("neck6");
		this.neck5 = this.neck6.getChild("neck5");
		this.neck4 = this.neck5.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -30.0F, 2.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(10, 59).addBox(-0.5F, 0.0F, -2.8F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.6418F, 1.4632F, -0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(37, 61).mirror().addBox(-1.0757F, -1.6951F, -1.242F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0581F, 6.6334F, 5.9912F, -1.1498F, -0.0184F, -0.2017F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(19, 65).mirror().addBox(-0.5953F, -0.2612F, 0.007F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7311F, -0.0512F, -0.1345F, -0.9526F, -0.3089F, -0.0459F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(38, 89).mirror().addBox(-0.5953F, 0.4639F, 2.6756F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7311F, -0.0512F, -0.1345F, -0.6908F, -0.3089F, -0.0459F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(44, 30).mirror().addBox(-0.5953F, 0.1484F, 3.7248F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7311F, -0.0512F, -0.1345F, -0.7781F, -0.3089F, -0.0459F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(10, 65).mirror().addBox(-2.3285F, -0.837F, 8.3149F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7311F, -0.0512F, -0.1345F, -0.8561F, -0.1723F, -0.2048F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(34, 15).mirror().addBox(0.0F, -1.9973F, 3.0176F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.049F, -4.8424F, -0.3346F, -0.226F, -0.5725F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(79, 51).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2785F, 3.225F, 1.7955F, -1.4922F, -0.152F, -0.0443F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(77, 37).mirror().addBox(-1.7831F, -1.1951F, 1.8539F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0581F, 6.6334F, 5.9912F, -0.9131F, 0.1998F, -0.4759F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(62, 67).mirror().addBox(-6.0238F, -0.837F, 9.8422F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7311F, -0.0512F, -0.1345F, -0.8412F, 0.0598F, -0.4665F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(58, 62).mirror().addBox(-1.0757F, -1.1951F, -0.642F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0581F, 6.6334F, 5.9912F, -0.888F, -0.0184F, -0.2017F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(34, 7).mirror().addBox(-1.2038F, -1.4574F, -5.3125F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0581F, 6.6334F, 5.9912F, -0.829F, -0.152F, -0.0443F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(46, 43).mirror().addBox(-2.1F, -0.7F, -4.1F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3357F, 5.0007F, 7.1578F, -0.7015F, -0.3838F, 0.0145F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(57, 49).mirror().addBox(-1.1F, -0.7F, 3.8F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(17, 25).mirror().addBox(-1.1F, -0.7F, -0.2F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1257F, 1.1721F, 1.6128F, -0.6453F, -0.0362F, -0.247F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(57, 31).mirror().addBox(-2.0F, 0.2F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7839F, -0.4717F, 0.1655F, -0.893F, 0.9566F, -1.0852F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(68, 30).mirror().addBox(-0.8F, -0.3F, 0.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6635F, -0.5447F, 3.1287F, -1.0487F, -0.6883F, 0.5058F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(-2.0F, 0.2F, 0.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9012F, -0.9422F, -0.7091F, -1.5111F, 1.0645F, -1.815F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(47, 21).mirror().addBox(-3.0F, 0.0F, 0.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4616F, -1.8183F, -3.523F, -1.5278F, 1.2168F, -2.1399F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(49, 79).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9609F, -2.5572F, -3.9738F, -0.3897F, 0.4676F, -0.9752F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 69).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6675F, -4.0802F, -4.0614F, -0.2307F, 0.0438F, -0.8668F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(68, 47).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -5.0999F, -2.6387F, -0.2339F, -0.7915F, -0.8116F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(78, 81).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(78, 81).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.8159F, -1.6798F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(16, 70).mirror().addBox(-0.5F, 0.0F, -2.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.5983F, -0.0931F, -0.6661F, 0.1726F, -0.1341F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(57, 31).addBox(0.0F, 0.2F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7839F, -0.4717F, 0.1655F, -0.893F, -0.9566F, 1.0852F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 44).addBox(-2.0F, 0.2F, 0.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9012F, -0.9422F, -0.7091F, -1.5111F, -1.0645F, 1.815F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(47, 21).addBox(0.0F, 0.0F, 0.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4616F, -1.8183F, -3.523F, -1.5278F, -1.2168F, 2.1399F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(49, 79).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9609F, -2.5572F, -3.9738F, -0.3897F, -0.4676F, 0.9752F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 69).addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6675F, -4.0802F, -4.0614F, -0.2307F, -0.0438F, 0.8668F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(68, 47).addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -5.0999F, -2.6387F, -0.2339F, 0.7915F, 0.8116F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(16, 70).addBox(-0.5F, 0.0F, -2.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.5983F, -0.0931F, -0.6661F, -0.1726F, 0.1341F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(68, 30).addBox(-0.2F, -0.3F, 0.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6635F, -0.5447F, 3.1287F, -1.0487F, 0.6883F, -0.5058F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(46, 43).addBox(0.1F, -0.7F, -4.1F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3357F, 5.0007F, 7.1578F, -0.7015F, 0.3838F, -0.0145F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(57, 49).addBox(-0.9F, -0.7F, 3.8F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(17, 25).addBox(-2.9F, -0.7F, -0.2F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1257F, 1.1721F, 1.6128F, -0.6453F, 0.0362F, 0.247F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(77, 37).addBox(0.7831F, -1.1951F, 1.8539F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0581F, 6.6334F, 5.9912F, -0.9131F, -0.1998F, 0.4759F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(62, 67).addBox(5.0238F, -0.837F, 9.8422F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7311F, -0.0512F, -0.1345F, -0.8412F, -0.0598F, 0.4665F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(10, 65).addBox(1.3285F, -0.837F, 8.3149F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7311F, -0.0512F, -0.1345F, -0.8561F, 0.1723F, 0.2048F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(37, 61).addBox(0.0757F, -1.6951F, -1.242F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.0581F, 6.6334F, 5.9912F, -1.1498F, 0.0184F, 0.2017F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(58, 62).addBox(0.0757F, -1.1951F, -0.642F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0581F, 6.6334F, 5.9912F, -0.888F, 0.0184F, 0.2017F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(79, 51).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2785F, 3.225F, 1.7955F, -1.4922F, 0.152F, 0.0443F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(19, 65).addBox(-0.4047F, -0.2612F, 0.007F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7311F, -0.0512F, -0.1345F, -0.9526F, 0.3089F, 0.0459F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(38, 89).addBox(-0.4047F, 0.4639F, 2.6756F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7311F, -0.0512F, -0.1345F, -0.6908F, 0.3089F, 0.0459F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(44, 30).addBox(-0.4047F, 0.1484F, 3.7248F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7311F, -0.0512F, -0.1345F, -0.7781F, 0.3089F, 0.0459F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(34, 7).addBox(0.2038F, -1.4574F, -5.3125F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0581F, 6.6334F, 5.9912F, -0.829F, 0.152F, 0.0443F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(29, 53).addBox(-0.5F, 0.0F, 0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.373F, 3.6172F, -0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r45 = hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(58, 56).addBox(-0.5F, -0.9F, -1.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3588F, 1.868F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r46 = hips.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(34, 15).addBox(-1.0F, -1.9973F, 3.0176F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.049F, -4.8424F, -0.3346F, 0.226F, 0.5725F));

		PartDefinition cube_r47 = hips.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.0973F, 0.0176F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.7F, -4.1F, -0.4014F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create().texOffs(76, 5).addBox(1.7F, -1.7F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(0, 82).addBox(-0.2435F, -0.7691F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 80).addBox(0.7F, 0.3F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.3F, 0.5355F, 0.7846F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r48 = leftLeg1.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(76, 56).addBox(-4.5F, -0.0109F, -0.0107F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(69, 0).addBox(-2.5F, -0.0109F, -0.0107F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7F, 8.8491F, -1.6756F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leftLeg1.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(76, 61).addBox(-0.5F, -0.0109F, -0.0107F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 8.8491F, -1.6756F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r50 = leftLeg1.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(69, 12).addBox(-4.0F, -7.4108F, 1.3893F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.7F, 15.4F, -1.6F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r51 = leftLeg1.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 49).addBox(-4.5F, 0.0F, -2.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2F, 2.3F, 1.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftLeg1.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(71, 16).addBox(-0.8F, -0.4F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.2F, -0.7F, 0.5F, 0.0F, 0.0F, -0.48F));

		PartDefinition cube_r53 = leftLeg1.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(49, 0).addBox(-1.0F, 0.0F, -4.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.7F, -0.0707F, -2.038F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftLeg1.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(34, 85).addBox(-3.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.2F, -1.0244F, -1.7373F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg1.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(43, 89).addBox(-3.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2F, -1.7F, -1.0F, 0.7418F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 9.1596F, -0.1524F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftLeg2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(39, 85).addBox(-0.5F, -3.507F, -2.3331F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 23).addBox(-2.5F, -3.507F, -2.3331F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 4.2472F, -1.4117F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftLeg2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(32, 39).addBox(-2.5F, -12.9F, 0.0F, 2.0F, 12.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.8F, 15.8547F, -1.8159F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftLeg2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(58, 7).addBox(-3.0F, 11.8F, -1.8F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(18, 39).addBox(-2.5F, -0.2F, -1.0F, 2.0F, 12.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.8F, 3.3497F, 0.7051F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftLeg2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(28, 75).addBox(-5.8F, -3.6498F, -0.1321F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 0).addBox(-5.8F, -4.6498F, -1.1321F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 5.0472F, 0.0883F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r60 = leftLeg2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(0, 58).addBox(-0.7F, -0.1285F, -0.631F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0F, 2.0636F, 0.3564F, -0.122F, 0.0064F, 0.052F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(0, 27).addBox(-1.5F, -0.4446F, -0.8239F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 17.0357F, -1.9422F, -1.0472F, 0.0F, 0.0F));

		PartDefinition toe = leftLeg3.addOrReplaceChild("toe", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5267F, 8.3523F, 0.7405F, 0.0873F, -0.3927F, 0.0F));

		PartDefinition cube_r61 = toe.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(46, 61).addBox(-1.5F, -2.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0F, 0.5F, 0.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r62 = toe.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(83, 0).addBox(-1.5F, 0.2F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5F, 0.0F, 1.3526F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(17, 11).addBox(-2.5F, -1.0F, -3.85F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.6358F, 0.5498F, 0.48F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(17, 18).addBox(-2.5F, -0.5F, -3.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.4894F, -3.806F, -0.6071F, 0.0F, 0.0F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create().texOffs(69, 76).addBox(-2.7F, -1.7F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(35, 82).addBox(-1.7565F, -0.7691F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 80).addBox(-2.7F, 0.3F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-3.3F, 0.5355F, 0.7846F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r63 = rightLeg1.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(77, 23).addBox(3.5F, -0.0109F, -0.0107F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(69, 6).addBox(1.5F, -0.0109F, -0.0107F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.7F, 8.8491F, -1.6756F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r64 = rightLeg1.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(76, 76).addBox(-0.5F, -0.0109F, -0.0107F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, 8.8491F, -1.6756F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r65 = rightLeg1.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(69, 19).addBox(2.0F, -7.4108F, 1.3893F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.7F, 15.4F, -1.6F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r66 = rightLeg1.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(9, 49).addBox(2.5F, 0.0F, -2.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.2F, 2.3F, 1.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r67 = rightLeg1.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(56, 81).addBox(-1.2F, -0.4F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.2F, -0.7F, 0.5F, 0.0F, 0.0F, 0.48F));

		PartDefinition cube_r68 = rightLeg1.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(46, 49).addBox(0.0F, 0.0F, -4.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.7F, -0.0707F, -2.038F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r69 = rightLeg1.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(44, 85).addBox(2.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-5.2F, -1.0244F, -1.7373F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r70 = rightLeg1.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(89, 43).addBox(2.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.2F, -1.7F, -1.0F, 0.7418F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 9.1596F, -0.1524F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r71 = rightLeg2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(85, 66).addBox(-0.5F, -3.507F, -2.3331F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 0).addBox(0.5F, -3.507F, -2.3331F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, 4.2472F, -1.4117F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r72 = rightLeg2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(39, 39).addBox(0.5F, -12.9F, 0.0F, 2.0F, 12.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.8F, 15.8547F, -1.8159F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r73 = rightLeg2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(58, 12).addBox(0.0F, 11.8F, -1.8F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(25, 39).addBox(0.5F, -0.2F, -1.0F, 2.0F, 12.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.8F, 3.3497F, 0.7051F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r74 = rightLeg2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(76, 0).addBox(3.8F, -3.6498F, -0.1321F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 19).addBox(2.8F, -4.6498F, -1.1321F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 5.0472F, 0.0883F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r75 = rightLeg2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(5, 58).addBox(-0.3F, -0.1285F, -0.631F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.0F, 2.0636F, 0.3564F, -0.122F, -0.0064F, -0.052F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(9, 31).addBox(-0.5F, -0.4446F, -0.8239F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 17.0357F, -1.9422F, -1.0472F, 0.0F, 0.0F));

		PartDefinition toe2 = rightLeg3.addOrReplaceChild("toe2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5267F, 8.3523F, 0.7405F, 0.0873F, 0.3927F, 0.0F));

		PartDefinition cube_r76 = toe2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(83, 76).addBox(0.5F, -2.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.0F, 0.5F, 0.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r77 = toe2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(83, 5).addBox(0.5F, 0.2F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.5F, 0.0F, 1.3526F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(19, 0).addBox(-1.5F, -1.0F, -3.85F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.6358F, 0.5498F, 0.4363F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(0, 20).addBox(-1.5F, -0.5F, -3.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.4894F, -3.806F, 0.0038F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 11).addBox(-0.5F, -0.1056F, 0.0068F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.005F))
				.texOffs(22, 91).addBox(0.0F, -0.7056F, 3.0068F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 91).addBox(0.0F, -0.7056F, 5.0068F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, 3.3F, -0.5939F, 0.0362F, -0.0244F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(78, 66).addBox(-0.5F, -0.394F, 0.0598F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(19, 91).addBox(0.0F, -0.894F, 0.0598F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3269F, 6.8022F, 0.2102F, 0.2991F, 0.0628F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(68, 25).addBox(-0.5F, -0.4415F, -0.1155F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0578F, 2.0666F, 0.2739F, 0.2947F, 0.0814F));

		PartDefinition cube_r78 = tail3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(16, 91).addBox(0.0F, -0.6F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3415F, -0.1155F, -0.1309F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -4.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(42, 71).addBox(0.0F, -3.4025F, -0.0576F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -0.9F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(30, 88).addBox(0.0F, -2.9822F, -0.9293F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -1.9F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(90, 60).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.315F, -0.4408F, 0.0554F, -0.0092F, -0.4448F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(7, 84).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.315F, -0.4408F, 0.0108F, 0.0177F, -0.9887F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(58, 17).mirror().addBox(-7.3936F, -1.7918F, -0.5273F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.315F, -0.4408F, 0.0005F, 0.0208F, -1.5123F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(5, 89).mirror().addBox(0.0F, -0.2F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 89).mirror().addBox(0.0F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.102F, -2.1333F, -0.3425F, 0.1055F, 0.2872F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(19, 7).mirror().addBox(-8.3936F, -1.7918F, -0.5273F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.015F, -2.2408F, 0.0071F, 0.055F, -1.4336F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(83, 64).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.015F, -2.2408F, 0.0337F, 0.0441F, -0.9094F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(90, 11).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.015F, -2.2408F, 0.0886F, 0.0015F, -0.3663F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(58, 17).addBox(2.3936F, -1.7918F, -0.5273F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.315F, -0.4408F, 0.0005F, -0.0208F, 1.5123F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(7, 84).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.315F, -0.4408F, 0.0108F, -0.0177F, 0.9887F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(90, 60).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.315F, -0.4408F, 0.0554F, 0.0092F, 0.4448F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(90, 11).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.015F, -2.2408F, 0.0886F, -0.0015F, 0.3663F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(83, 64).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.015F, -2.2408F, 0.0337F, -0.0441F, 0.9094F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(19, 7).addBox(2.3936F, -1.7918F, -0.5273F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.015F, -2.2408F, 0.0071F, -0.055F, 1.4336F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(5, 89).addBox(-1.0F, -0.2F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 89).addBox(-1.0F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.102F, -2.1333F, -0.3425F, -0.1055F, -0.2872F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(47, 7).addBox(-1.0F, -0.0506F, -0.0332F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -2.1F, -3.7F, -0.3578F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4F, -4.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r96 = chest.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(15, 44).addBox(0.0F, -3.0468F, -1.0375F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.2F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r97 = chest.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(65, 77).addBox(0.0F, -1.9008F, -1.0624F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -1.7F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r98 = chest.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(51, 70).addBox(0.0F, -1.9924F, -0.0881F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -4.7F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r99 = chest.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(0, 85).mirror().addBox(-1.0286F, -0.0592F, 0.0201F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9714F, 8.6535F, -3.4794F, 1.1626F, 0.311F, 0.6158F));

		PartDefinition cube_r100 = chest.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(68, 41).mirror().addBox(-5.0F, -0.5F, 0.0F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.687F, 8.291F, -2.1773F, 1.0839F, 1.232F, 0.3847F));

		PartDefinition cube_r101 = chest.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(68, 51).mirror().addBox(-4.1F, -0.2F, 0.0F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0309F, 7.3088F, -3.0474F, 0.5243F, 1.1361F, 0.1096F));

		PartDefinition cube_r102 = chest.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(78, 74).mirror().addBox(-2.8F, -1.0F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0309F, 7.3088F, -3.0474F, 0.9352F, 1.0403F, 0.5626F));

		PartDefinition cube_r103 = chest.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(84, 30).mirror().addBox(-2.2F, -0.5F, 0.2F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3386F, 5.9975F, -4.3224F, 1.2065F, 0.9161F, 0.9882F));

		PartDefinition cube_r104 = chest.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(85, 70).mirror().addBox(-0.2F, -1.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5989F, 8.0824F, -2.0847F, 1.3805F, 0.6526F, 1.1777F));

		PartDefinition cube_r105 = chest.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(83, 84).mirror().addBox(-0.4F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6134F, 7.0811F, -3.4861F, 1.1021F, 0.6479F, 0.8327F));

		PartDefinition cube_r106 = chest.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(78, 84).mirror().addBox(-0.2F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8827F, 5.4595F, -4.529F, 0.9016F, 0.8835F, 0.6129F));

		PartDefinition cube_r107 = chest.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(54, 84).mirror().addBox(-1.0286F, -0.0076F, -0.0131F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.4714F, 7.2535F, -4.9794F, 1.1188F, 0.6009F, 0.8613F));

		PartDefinition cube_r108 = chest.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(84, 47).mirror().addBox(-1.0286F, -0.0971F, -0.0138F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.4714F, 5.8535F, -6.2794F, 1.0466F, 0.666F, 0.8185F));

		PartDefinition cube_r109 = chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(21, 75).mirror().addBox(-0.5F, -0.9F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.4684F, 4.7704F, -5.5765F, 0.161F, -0.4454F, -0.285F));

		PartDefinition cube_r110 = chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(89, 86).mirror().addBox(0.0843F, -0.6332F, 1.2558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(69, 89).mirror().addBox(0.0843F, -0.6332F, 0.7558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.7F, -0.2964F, -1.2961F, 0.3052F, 0.0306F, 0.3902F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(67, 61).mirror().addBox(0.0F, -0.5523F, -0.7485F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 3.1036F, -4.8961F, 0.5236F, -0.3316F, 0.0F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(78, 70).mirror().addBox(-0.5F, 0.5002F, -1.9997F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 2.6473F, -4.7533F, 0.99F, -0.4454F, -0.285F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(21, 80).mirror().addBox(0.0F, 0.365F, 0.1294F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 3.1036F, -4.8961F, 0.9076F, -0.3316F, 0.0F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(67, 56).mirror().addBox(0.0758F, -0.7678F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.8F, 2.2036F, -3.0961F, 0.768F, -0.2421F, 0.2221F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(85, 80).mirror().addBox(0.0843F, -0.2778F, -0.0802F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7F, -0.2964F, -1.2961F, 0.7067F, 0.0306F, 0.3902F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(33, 89).mirror().addBox(0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(89, 25).mirror().addBox(0.3F, -0.5F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(89, 22).mirror().addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0902F, -1.1345F, -0.1068F, -0.0807F, 0.1055F, 0.2872F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(68, 35).mirror().addBox(-6.3936F, -1.7918F, -0.5273F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.215F, -4.1408F, 0.0407F, 0.2264F, -1.455F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(83, 60).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.215F, -4.1408F, 0.1494F, 0.1755F, -0.9229F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(89, 49).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.215F, -4.1408F, 0.2547F, 0.0552F, -0.3878F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(89, 38).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.915F, -2.1408F, 0.155F, 0.0231F, -0.3306F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(79, 41).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.915F, -2.1408F, 0.0796F, 0.0968F, -0.8713F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(57, 54).mirror().addBox(-7.3936F, -1.7918F, -0.5273F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.915F, -2.1408F, 0.0204F, 0.1236F, -1.3975F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(89, 28).mirror().addBox(-2.9152F, -0.4179F, -0.4639F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.815F, -0.1408F, 0.0886F, 0.0015F, -0.314F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(69, 23).mirror().addBox(-4.2769F, -1.8678F, -0.5341F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.815F, -0.1408F, 0.0337F, 0.0441F, -0.857F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(19, 9).mirror().addBox(-8.77F, -3.756F, -0.5341F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.815F, -0.1408F, 0.0071F, 0.055F, -1.3812F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(33, 89).addBox(-1.5F, -0.5F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 25).addBox(-1.3F, -0.5F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 22).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0902F, -1.1345F, -0.1068F, -0.0807F, -0.1055F, -0.2872F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(89, 49).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.215F, -4.1408F, 0.2547F, -0.0552F, 0.3878F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(83, 60).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.215F, -4.1408F, 0.1494F, -0.1755F, 0.9229F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(68, 35).addBox(2.3936F, -1.7918F, -0.5273F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.215F, -4.1408F, 0.0407F, -0.2264F, 1.455F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(57, 54).addBox(2.3936F, -1.7918F, -0.5273F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.915F, -2.1408F, 0.0204F, -0.1236F, 1.3975F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(79, 41).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.915F, -2.1408F, 0.0796F, -0.0968F, 0.8713F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(89, 38).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.915F, -2.1408F, 0.155F, -0.0231F, 0.3306F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(19, 9).addBox(2.77F, -3.756F, -0.5341F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.815F, -0.1408F, 0.0071F, -0.055F, 1.3812F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(69, 23).addBox(2.2769F, -1.8678F, -0.5341F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.815F, -0.1408F, 0.0337F, -0.0441F, 0.857F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(89, 28).addBox(1.9152F, -0.4179F, -0.4639F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.815F, -0.1408F, 0.0886F, -0.0015F, 0.314F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(89, 86).addBox(-1.0843F, -0.6332F, 1.2558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 89).addBox(-1.0843F, -0.6332F, 0.7558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.7F, -0.2964F, -1.2961F, 0.3052F, -0.0306F, -0.3902F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(85, 80).addBox(-1.0843F, -0.2778F, -0.0802F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7F, -0.2964F, -1.2961F, 0.7067F, -0.0306F, -0.3902F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(67, 61).addBox(-1.0F, -0.5523F, -0.7485F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.0F, 3.1036F, -4.8961F, 0.5236F, 0.3316F, 0.0F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(67, 56).addBox(-1.0758F, -0.7678F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.8F, 2.2036F, -3.0961F, 0.768F, 0.2421F, -0.2221F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(21, 80).addBox(-1.0F, 0.365F, 0.1294F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 3.1036F, -4.8961F, 0.9076F, 0.3316F, 0.0F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(21, 75).addBox(-0.5F, -0.9F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.4684F, 4.7704F, -5.5765F, 0.161F, 0.4454F, 0.285F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(78, 70).addBox(-0.5F, 0.5002F, -1.9997F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 2.6473F, -4.7533F, 0.99F, 0.4454F, 0.285F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(89, 35).addBox(-0.6714F, 0.0177F, -0.0203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1714F, 9.5535F, -1.7794F, 1.1851F, 0.0F, 0.0F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(85, 70).addBox(-0.8F, -1.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5989F, 8.0824F, -2.0847F, 1.3805F, -0.6526F, -1.1777F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(0, 85).addBox(0.0286F, -0.0592F, 0.0201F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9714F, 8.6535F, -3.4794F, 1.1626F, -0.311F, -0.6158F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(85, 18).addBox(-0.6714F, -0.0592F, 0.0201F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1714F, 8.6824F, -3.8388F, 1.1502F, 0.0F, 0.0F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(79, 32).addBox(-1.1714F, -0.0592F, 0.0201F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1714F, 8.6535F, -3.4794F, 1.0629F, 0.0F, 0.0F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(83, 84).addBox(-0.6F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6134F, 7.0811F, -3.4861F, 1.1021F, -0.6479F, -0.8327F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(54, 84).addBox(0.0286F, -0.0076F, -0.0131F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.4714F, 7.2535F, -4.9794F, 1.1188F, -0.6009F, -0.8613F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(85, 14).addBox(-0.1714F, -0.2076F, -0.3131F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 37).addBox(-1.1714F, -0.0076F, -0.0131F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3286F, 7.2535F, -4.9794F, 0.836F, 0.0F, 0.0F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(68, 41).addBox(0.0F, -0.5F, 0.0F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.687F, 8.291F, -2.1773F, 1.0839F, -1.232F, -0.3847F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(68, 51).addBox(-0.9F, -0.2F, 0.0F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0309F, 7.3088F, -3.0474F, 0.5243F, -1.1361F, -0.1096F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(78, 74).addBox(-1.2F, -1.0F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0309F, 7.3088F, -3.0474F, 0.9352F, -1.0403F, -0.5626F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(84, 30).addBox(-0.8F, -0.5F, 0.2F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3386F, 5.9975F, -4.3224F, 1.2065F, -0.9161F, -0.9882F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(78, 84).addBox(-0.8F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8827F, 5.4595F, -4.529F, 0.9016F, -0.8835F, -0.6129F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(84, 47).addBox(0.0286F, -0.0971F, -0.0138F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.4714F, 5.8535F, -6.2794F, 1.0466F, -0.666F, -0.8185F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(85, 10).addBox(-0.1714F, -0.2971F, -0.3138F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(47, 26).addBox(-1.1714F, -0.0971F, -0.0138F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3286F, 5.8535F, -6.2794F, 0.7488F, 0.0F, 0.0F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(68, 43).addBox(-1.1714F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3286F, 4.6535F, -6.2794F, 0.4171F, 0.0F, 0.0F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(84, 43).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.7346F, -6.4622F, 0.2426F, 0.0F, 0.0F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(18, 31).addBox(-1.0F, -1.3F, -3.9F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4F, -1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create().texOffs(46, 70).addBox(-0.5059F, -0.5647F, -0.6475F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.3353F, 4.0785F, -4.3422F, 0.8617F, 0.4939F, -0.7387F));

		PartDefinition cube_r161 = leftArm1.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(14, 84).addBox(0.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.5059F, 1.4353F, 0.3525F, -0.4712F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0941F, 4.1918F, -0.4167F, -1.9639F, 0.0387F, -0.0202F));

		PartDefinition cube_r162 = leftArm2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(49, 83).addBox(-1.75F, 0.4F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2F, -0.75F, 0.5F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r163 = leftArm2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(63, 81).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.05F, 2.25F, -0.5F, -0.0436F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create().texOffs(84, 22).addBox(-1.0F, -0.35F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.2872F, 2.7035F, -0.3772F, 0.1291F, -0.0692F, 0.0532F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create().texOffs(37, 71).addBox(-0.4941F, -0.5647F, -0.6475F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-3.3353F, 4.0785F, -4.3422F, 0.8922F, -0.2284F, 0.8363F));

		PartDefinition cube_r164 = rightArm1.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(19, 84).addBox(-1.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.5059F, 1.4353F, 0.3525F, -0.4712F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0941F, 4.1918F, -0.4167F, -1.9639F, -0.0387F, 0.0202F));

		PartDefinition cube_r165 = rightArm2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(83, 55).addBox(0.75F, 0.4F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2F, -0.75F, 0.5F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r166 = rightArm2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(68, 81).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.05F, 2.25F, -0.5F, -0.0436F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create().texOffs(24, 84).addBox(0.0F, -0.35F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.2872F, 2.7035F, -0.3772F, 0.1291F, 0.0692F, -0.0532F));

		PartDefinition neck6 = chest.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offset(0.0F, -0.2F, -4.6F));

		PartDefinition cube_r167 = neck6.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(13, 91).addBox(0.0F, -2.9943F, -2.1586F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 70).addBox(-0.5F, -1.9943F, -2.1586F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.8F, -0.2F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r168 = neck6.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(90, 9).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.115F, -1.3408F, 0.4069F, 0.1421F, -0.7393F));

		PartDefinition cube_r169 = neck6.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(83, 62).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.115F, -1.3408F, 0.2388F, 0.3271F, -1.2671F));

		PartDefinition cube_r170 = neck6.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(83, 62).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.115F, -1.3408F, 0.2388F, -0.3271F, 1.2671F));

		PartDefinition cube_r171 = neck6.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(90, 9).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.115F, -1.3408F, 0.4069F, -0.1421F, 0.7393F));

		PartDefinition neck5 = neck6.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offset(0.0F, -1.1F, -1.6F));

		PartDefinition cube_r172 = neck5.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(10, 91).addBox(0.0F, -1.9F, -2.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 42).addBox(-0.5F, -1.1F, -3.3F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.2F, -0.4363F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8F, -2.3F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r173 = neck4.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(90, 80).addBox(0.0F, -2.6981F, 2.9713F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 71).addBox(0.0F, -2.6981F, 0.9713F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 31).addBox(-0.5F, -2.0981F, -0.0287F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -3.7F, -3.5F, -1.0297F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.0F, -2.3F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r174 = neck3.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(90, 68).addBox(0.0F, 0.0065F, 0.0537F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, 0.1F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r175 = neck3.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(90, 65).addBox(0.0F, 1.9374F, -0.0567F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 62).addBox(0.0F, -0.0626F, 0.0433F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, -0.4F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r176 = neck3.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(51, 56).addBox(-1.0F, 0.0773F, -1.9318F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -6.1F, -0.7F, 0.2443F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -5.5F, -1.2F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r177 = neck2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(58, 74).addBox(0.0F, 2.0061F, 0.4563F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 36).addBox(0.0F, 0.0061F, -0.8437F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7F, -1.5F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r178 = neck2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(55, 67).addBox(-1.0F, -0.0728F, -1.8396F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -3.2F, -2.3F, 0.7941F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.4F, -2.5F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r179 = neck.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(90, 17).addBox(0.0F, -1.5039F, -0.0513F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -0.7F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r180 = neck.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(90, 13).addBox(0.0F, -2.0108F, 0.0255F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -2.8F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r181 = neck.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(47, 14).addBox(-1.0F, -0.1384F, -0.2862F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.5F, -3.5F, -0.1833F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -0.6F, -3.5F));

		PartDefinition cube_r182 = head.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(0, 40).addBox(-2.0F, -1.0F, -0.4F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.95F, -0.3843F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r183 = head.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(40, 56).addBox(-2.0F, -0.0776F, 0.0301F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -2.2F, -2.6F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r184 = head.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(88, 3).addBox(-0.5F, -0.1935F, 0.0666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(70, 53).addBox(-1.5F, 0.0065F, 0.8666F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -4.3F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r185 = head.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(57, 26).addBox(-1.5F, -3.6F, 0.2F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.009F))
				.texOffs(84, 26).addBox(-0.5F, -2.6F, 0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(18, 53).addBox(-0.5F, -0.6F, -2.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 1.8504F, -2.245F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r186 = head.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(88, 0).addBox(-0.5F, 0.0355F, -0.9738F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 4.3F, -10.2F, 1.7802F, 0.0F, 0.0F));

		PartDefinition cube_r187 = head.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(71, 71).addBox(-0.5F, 0.0106F, -1.9836F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 2.3F, -10.0F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r188 = head.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(71, 66).addBox(-0.5F, 0.0087F, -2.0428F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.5F, -9.0F, 1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r189 = head.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(9, 70).addBox(-0.5F, -0.0657F, -2.0414F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.7F, -7.4F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r190 = head.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(46, 37).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 2.628F, -6.5511F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r191 = head.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(42, 77).addBox(-0.5F, 0.0221F, -2.0319F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -1.3F, -5.5F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r192 = head.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(29, 84).addBox(-0.5F, -1.7F, -4.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.6F, 0.0873F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.2F, 1.769F, -0.3621F));

		PartDefinition cube_r193 = leftFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(46, 65).addBox(-0.5F, -0.3936F, -1.7737F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4538F, 0.1047F, 0.0F));

		PartDefinition cube_r194 = leftFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(28, 65).addBox(-0.5F, -0.7877F, -4.3774F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2094F, 0.1047F, 0.0F));

		PartDefinition cube_r195 = leftFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(58, 77).addBox(-1.0F, 0.0221F, -2.0319F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.7F, -3.069F, -5.1379F, 0.2108F, 0.1564F, -0.6292F));

		PartDefinition cube_r196 = leftFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(40, 53).addBox(-1.0243F, 0.0524F, -0.8236F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.3F, -1.469F, -7.0379F, 0.684F, 0.3631F, -0.2037F));

		PartDefinition cube_r197 = leftFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(49, 88).addBox(-1.0435F, -0.0347F, -0.5872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, -3.0916F, -4.5826F, 0.0674F, 0.0555F, -0.6875F));

		PartDefinition cube_r198 = leftFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(59, 36).addBox(-0.0983F, -1.9046F, 0.0804F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.2F, 1.131F, -4.2379F, 1.9639F, 0.1346F, -0.1889F));

		PartDefinition cube_r199 = leftFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(9, 27).addBox(-1.0F, -0.0657F, -2.0414F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.7F, -2.469F, -7.0379F, 0.6226F, 0.4694F, -0.3552F));

		PartDefinition cube_r200 = leftFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(77, 47).addBox(-0.9986F, 0.0232F, -1.9215F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, -2.269F, -5.0379F, 0.2587F, 0.0405F, -0.1518F));

		PartDefinition cube_r201 = leftFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(25, 88).addBox(1.0F, -0.0114F, -0.0516F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-2.6F, -2.269F, -4.4379F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r202 = leftFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(20, 88).addBox(1.0F, 0.1065F, -0.0334F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.6F, -3.269F, -3.9379F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r203 = leftFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(77, 28).addBox(-0.882F, -0.1375F, -0.1241F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3F, -3.4649F, -3.3916F, 0.4158F, -0.2446F, -0.1167F));

		PartDefinition cube_r204 = leftFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(86, 32).addBox(-0.3F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0F, -3.0649F, -3.3916F, 0.4674F, 0.3542F, 0.1733F));

		PartDefinition cube_r205 = leftFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(0, 94).addBox(-0.1F, -0.447F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8769F, -4.0927F, -0.3661F, 0.7407F, 1.2767F, 2.0181F));

		PartDefinition cube_r206 = leftFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(15, 88).addBox(0.0F, -0.0506F, -0.7192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, -4.7123F, -0.1515F, 0.2045F, -0.2914F, 1.1275F));

		PartDefinition cube_r207 = leftFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(0, 94).addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(0, 94).addBox(-0.5F, -0.5F, 0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.9857F, -3.4636F, -1.3378F, 0.1954F, -0.0162F, 1.2626F));

		PartDefinition cube_r208 = leftFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(77, 43).addBox(-0.191F, -0.126F, -1.8203F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.7F, -4.3856F, -0.4278F, 0.202F, -0.2558F, 1.2141F));

		PartDefinition cube_r209 = leftFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(10, 88).addBox(1.0F, 0.0065F, -0.1334F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.6F, -3.269F, -3.9379F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r210 = leftFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(64, 86).addBox(-0.5F, -0.7588F, 0.4715F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 86).addBox(-0.5F, -0.7588F, -0.0285F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.6F, -1.5388F, -0.7103F, -0.1222F, 0.1571F, 0.0F));

		PartDefinition cube_r211 = leftFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(73, 81).addBox(-0.4F, -1.6F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.7998F, -0.2546F, 0.0346F, 0.0046F, -0.1308F));

		PartDefinition cube_r212 = leftFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(86, 51).addBox(-0.5F, -0.5763F, -0.7107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -1.5388F, -0.7103F, 0.4014F, 0.1571F, 0.0F));

		PartDefinition cube_r213 = leftFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(89, 46).addBox(1.0F, -0.9434F, -1.0239F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1F, -0.769F, -3.1379F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r214 = leftFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(69, 86).addBox(-0.2F, -0.6F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(84, 88).addBox(-0.36F, -0.6F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(0, 78).addBox(-0.492F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.1F, -2.2572F, -2.6898F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r215 = leftFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(0, 73).addBox(0.6F, -1.5F, -3.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2F, -1.769F, -0.2379F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r216 = leftFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(86, 40).addBox(-0.5F, -0.3882F, -1.5094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6F, -1.5388F, -0.7103F, 0.0873F, 0.1571F, 0.0F));

		PartDefinition cube_r217 = leftFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(88, 6).addBox(-0.9224F, 0.0323F, -0.5174F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.2F, -2.2916F, -4.5826F, 0.0832F, 0.0262F, -0.3043F));

		PartDefinition cube_r218 = leftFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(30, 70).addBox(-0.7824F, 0.0366F, 0.0184F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3F, 0.431F, -3.6379F, 3.0713F, 0.2291F, -0.1959F));

		PartDefinition cube_r219 = leftFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(0, 94).addBox(-0.57F, -2.1F, -2.6962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 94).addBox(-0.57F, -2.0874F, -1.6962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(19, 59).addBox(-0.6F, -2.0872F, -2.9962F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4F, -1.769F, 0.7621F, 0.0843F, 0.1451F, -0.0577F));

		PartDefinition cube_r220 = leftFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(0, 94).addBox(-0.5F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.809F, -2.4584F, -1.2758F, 0.3286F, 0.1451F, -0.0577F));

		PartDefinition cube_r221 = leftFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(0, 94).addBox(-0.5F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6972F, -2.5365F, -0.4811F, 0.6079F, 0.1451F, -0.0577F));

		PartDefinition cube_r222 = leftFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(5, 86).addBox(-0.7824F, -0.9839F, 0.0076F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3F, 0.431F, -3.6379F, 2.1114F, 0.2291F, -0.1959F));

		PartDefinition cube_r223 = leftFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(28, 59).addBox(-0.9454F, -1.972F, -0.1181F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 1.531F, -6.1379F, 1.9259F, 0.4351F, -0.0947F));

		PartDefinition cube_r224 = leftFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(62, 72).addBox(-0.3F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.071F, 1.8214F, -8.2406F, 2.0858F, 0.3081F, -0.0294F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.2F, 1.769F, -0.3621F));

		PartDefinition cube_r225 = rightFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(46, 65).mirror().addBox(-0.5F, -0.3936F, -1.7737F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4538F, -0.1047F, 0.0F));

		PartDefinition cube_r226 = rightFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(28, 65).mirror().addBox(-0.5F, -0.7877F, -4.3774F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2094F, -0.1047F, 0.0F));

		PartDefinition cube_r227 = rightFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(58, 77).mirror().addBox(0.0F, 0.0221F, -2.0319F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.7F, -3.069F, -5.1379F, 0.2108F, -0.1564F, 0.6292F));

		PartDefinition cube_r228 = rightFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(40, 53).mirror().addBox(0.0243F, 0.0524F, -0.8236F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.3F, -1.469F, -7.0379F, 0.684F, -0.3631F, 0.2037F));

		PartDefinition cube_r229 = rightFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(49, 88).mirror().addBox(0.0435F, -0.0347F, -0.5872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7F, -3.0916F, -4.5826F, 0.0674F, -0.0555F, 0.6875F));

		PartDefinition cube_r230 = rightFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(59, 36).mirror().addBox(-0.9017F, -1.9046F, 0.0804F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.2F, 1.131F, -4.2379F, 1.9639F, -0.1346F, 0.1889F));

		PartDefinition cube_r231 = rightFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(9, 27).mirror().addBox(0.0F, -0.0657F, -2.0414F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.7F, -2.469F, -7.0379F, 0.6226F, -0.4694F, 0.3552F));

		PartDefinition cube_r232 = rightFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(77, 47).mirror().addBox(-0.0014F, 0.0232F, -1.9215F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1F, -2.269F, -5.0379F, 0.2587F, -0.0405F, 0.1518F));

		PartDefinition cube_r233 = rightFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(25, 88).mirror().addBox(-2.0F, -0.0114F, -0.0516F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(2.6F, -2.269F, -4.4379F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r234 = rightFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(20, 88).mirror().addBox(-2.0F, 0.1065F, -0.0334F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(2.6F, -3.269F, -3.9379F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r235 = rightFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(77, 28).mirror().addBox(-0.118F, -0.1375F, -0.1241F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.3F, -3.4649F, -3.3916F, 0.4158F, 0.2446F, 0.1167F));

		PartDefinition cube_r236 = rightFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(86, 32).mirror().addBox(-0.7F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.0F, -3.0649F, -3.3916F, 0.4674F, -0.3542F, -0.1733F));

		PartDefinition cube_r237 = rightFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(0, 94).mirror().addBox(-0.9F, -0.447F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8769F, -4.0927F, -0.3661F, 0.7407F, -1.2767F, -2.0181F));

		PartDefinition cube_r238 = rightFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(15, 88).mirror().addBox(-1.0F, -0.0506F, -0.7192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7F, -4.7123F, -0.1515F, 0.2045F, 0.2914F, -1.1275F));

		PartDefinition cube_r239 = rightFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(0, 94).mirror().addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(0, 94).mirror().addBox(-0.5F, -0.5F, 0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.9857F, -3.4636F, -1.3378F, 0.1954F, 0.0162F, -1.2626F));

		PartDefinition cube_r240 = rightFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(77, 43).mirror().addBox(-0.809F, -0.126F, -1.8203F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.7F, -4.3856F, -0.4278F, 0.202F, 0.2558F, -1.2141F));

		PartDefinition cube_r241 = rightFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(10, 88).mirror().addBox(-2.0F, 0.0065F, -0.1334F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(2.6F, -3.269F, -3.9379F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r242 = rightFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(64, 86).mirror().addBox(-0.5F, -0.7588F, 0.4715F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(59, 86).mirror().addBox(-0.5F, -0.7588F, -0.0285F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.6F, -1.5388F, -0.7103F, -0.1222F, -0.1571F, 0.0F));

		PartDefinition cube_r243 = rightFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(73, 81).mirror().addBox(-0.6F, -1.6F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -0.7998F, -0.2546F, 0.0346F, -0.0046F, 0.1308F));

		PartDefinition cube_r244 = rightFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(86, 51).mirror().addBox(-0.5F, -0.5763F, -0.7107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, -1.5388F, -0.7103F, 0.4014F, -0.1571F, 0.0F));

		PartDefinition cube_r245 = rightFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(89, 46).mirror().addBox(-2.0F, -0.9434F, -1.0239F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.1F, -0.769F, -3.1379F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r246 = rightFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(69, 86).mirror().addBox(-0.8F, -0.6F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(84, 88).mirror().addBox(-0.64F, -0.6F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(0, 78).mirror().addBox(-0.508F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.1F, -2.2572F, -2.6898F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r247 = rightFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(0, 73).mirror().addBox(-1.6F, -1.5F, -3.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.2F, -1.769F, -0.2379F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r248 = rightFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(86, 40).mirror().addBox(-0.5F, -0.3882F, -1.5094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.6F, -1.5388F, -0.7103F, 0.0873F, -0.1571F, 0.0F));

		PartDefinition cube_r249 = rightFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(88, 6).mirror().addBox(-0.0776F, 0.0323F, -0.5174F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.2F, -2.2916F, -4.5826F, 0.0832F, -0.0262F, 0.3043F));

		PartDefinition cube_r250 = rightFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(30, 70).mirror().addBox(-0.2176F, 0.0366F, 0.0184F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.3F, 0.431F, -3.6379F, 3.0713F, -0.2291F, 0.1959F));

		PartDefinition cube_r251 = rightFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(0, 94).mirror().addBox(-0.43F, -2.1F, -2.6962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 94).mirror().addBox(-0.43F, -2.0874F, -1.6962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(19, 59).mirror().addBox(-0.4F, -2.0872F, -2.9962F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.4F, -1.769F, 0.7621F, 0.0843F, -0.1451F, 0.0577F));

		PartDefinition cube_r252 = rightFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(0, 94).mirror().addBox(-0.5F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.809F, -2.4584F, -1.2758F, 0.3286F, -0.1451F, 0.0577F));

		PartDefinition cube_r253 = rightFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(0, 94).mirror().addBox(-0.5F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6972F, -2.5365F, -0.4811F, 0.6079F, -0.1451F, 0.0577F));

		PartDefinition cube_r254 = rightFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(5, 86).mirror().addBox(-0.2176F, -0.9839F, 0.0076F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.3F, 0.431F, -3.6379F, 2.1114F, -0.2291F, 0.1959F));

		PartDefinition cube_r255 = rightFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(28, 59).mirror().addBox(-0.0546F, -1.972F, -0.1181F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.531F, -6.1379F, 1.9259F, -0.4351F, 0.0947F));

		PartDefinition cube_r256 = rightFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(62, 72).mirror().addBox(-0.7F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.071F, 1.8214F, -8.2406F, 2.0858F, -0.3081F, 0.0294F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 2.1F, 0.2F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r257 = jaw.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(88, 83).mirror().addBox(0.008F, -0.0834F, -3.5775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(28, 80).mirror().addBox(0.008F, -0.1221F, -1.9877F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(79, 88).mirror().addBox(0.008F, -0.0834F, -2.7776F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.3551F, 1.2802F, -6.6543F, -0.0524F, -0.2443F, 0.0F));

		PartDefinition cube_r258 = jaw.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(88, 57).mirror().addBox(-0.3F, 0.2895F, 0.1724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 0.4238F, -0.3029F, 0.7156F, -0.4189F, 0.0F));

		PartDefinition cube_r259 = jaw.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(88, 54).mirror().addBox(-0.3F, -0.0462F, -0.0914F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 0.4238F, -0.3029F, 0.1047F, -0.4189F, 0.0F));

		PartDefinition cube_r260 = jaw.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(42, 81).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(42, 81).addBox(-0.2327F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.1336F, 1.6059F, -7.3866F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r261 = jaw.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(88, 77).mirror().addBox(0.0F, -0.8656F, -6.3925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 1.0301F, -0.4419F, 0.1571F, -0.1047F, 0.0F));

		PartDefinition cube_r262 = jaw.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(64, 89).mirror().addBox(0.008F, -0.852F, -1.9946F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3551F, 1.2802F, -6.6543F, 0.3316F, -0.2443F, 0.0F));

		PartDefinition cube_r263 = jaw.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(89, 89).mirror().addBox(0.008F, -1.0291F, -0.9287F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.3551F, 1.2802F, -6.6543F, 0.5061F, -0.2443F, 0.0F));

		PartDefinition cube_r264 = jaw.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(88, 74).mirror().addBox(0.0F, -2.6143F, -6.1926F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 1.0301F, -0.4419F, 0.2967F, -0.1047F, 0.0F));

		PartDefinition cube_r265 = jaw.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(37, 66).mirror().addBox(-0.5F, -0.9636F, -0.0982F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0313F, 2.143F, -6.5283F, 0.2239F, -0.3581F, -0.0796F));

		PartDefinition cube_r266 = jaw.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(14, 75).mirror().addBox(0.0F, -1.9561F, -5.4644F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 1.0301F, -0.4419F, 0.1745F, -0.1047F, 0.0F));

		PartDefinition cube_r267 = jaw.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(51, 74).mirror().addBox(0.0F, -2.2025F, -3.4616F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 1.0301F, -0.4419F, 0.2443F, -0.1047F, 0.0F));

		PartDefinition cube_r268 = jaw.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(78, 14).mirror().addBox(0.0F, -0.6667F, -1.8236F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 1.0301F, -0.4419F, -0.1222F, -0.1047F, 0.0F));

		PartDefinition cube_r269 = jaw.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(7, 75).mirror().addBox(0.0F, 0.9124F, 2.2253F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 1.0301F, -0.4419F, -2.7576F, -0.1047F, 0.0F));

		PartDefinition cube_r270 = jaw.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(35, 78).mirror().addBox(0.0F, 2.1107F, -2.2324F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 1.0301F, -0.4419F, -1.5184F, -0.1047F, 0.0F));

		PartDefinition cube_r271 = jaw.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(74, 88).mirror().addBox(0.0F, 0.1801F, -3.0931F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 1.0301F, -0.4419F, -0.8203F, -0.1047F, 0.0F));

		PartDefinition cube_r272 = jaw.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(78, 18).mirror().addBox(0.0F, -0.4781F, -2.4584F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 1.0301F, -0.4419F, -0.5585F, -0.1047F, 0.0F));

		PartDefinition cube_r273 = jaw.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(54, 88).mirror().addBox(-1.0F, 0.0F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(54, 88).addBox(2.0F, 0.0F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -0.3762F, -0.4029F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r274 = jaw.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(78, 10).mirror().addBox(-0.3F, -0.8F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 0.4238F, -0.3029F, 0.0F, -0.4189F, 0.0F));

		PartDefinition cube_r275 = jaw.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(88, 57).addBox(-0.7F, 0.2895F, 0.1724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.4238F, -0.3029F, 0.7156F, 0.4189F, 0.0F));

		PartDefinition cube_r276 = jaw.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(88, 54).addBox(-0.7F, -0.0462F, -0.0914F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.7F, 0.4238F, -0.3029F, 0.1047F, 0.4189F, 0.0F));

		PartDefinition cube_r277 = jaw.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(28, 80).addBox(-1.008F, -0.1221F, -1.9877F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(88, 83).addBox(-1.008F, -0.0834F, -3.5775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(79, 88).addBox(-1.008F, -0.0834F, -2.7776F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.3551F, 1.2802F, -6.6543F, -0.0524F, 0.2443F, 0.0F));

		PartDefinition cube_r278 = jaw.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(88, 77).addBox(-1.0F, -0.8656F, -6.3925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0301F, -0.4419F, 0.1571F, 0.1047F, 0.0F));

		PartDefinition cube_r279 = jaw.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(59, 89).addBox(-0.6F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8866F, 1.5351F, -9.5346F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r280 = jaw.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(64, 89).addBox(-1.008F, -0.852F, -1.9946F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3551F, 1.2802F, -6.6543F, 0.3316F, 0.2443F, 0.0F));

		PartDefinition cube_r281 = jaw.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(89, 89).addBox(-1.008F, -1.0291F, -0.9287F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.3551F, 1.2802F, -6.6543F, 0.5061F, 0.2443F, 0.0F));

		PartDefinition cube_r282 = jaw.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(88, 74).addBox(-1.0F, -2.6143F, -6.1926F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0301F, -0.4419F, 0.2967F, 0.1047F, 0.0F));

		PartDefinition cube_r283 = jaw.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(37, 66).addBox(-0.5F, -0.9636F, -0.0982F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.9687F, 2.143F, -6.5283F, 0.2239F, 0.3581F, 0.0796F));

		PartDefinition cube_r284 = jaw.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(14, 75).addBox(-1.0F, -1.9561F, -5.4644F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, 1.0301F, -0.4419F, 0.1745F, 0.1047F, 0.0F));

		PartDefinition cube_r285 = jaw.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(51, 74).addBox(-1.0F, -2.2025F, -3.4616F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0301F, -0.4419F, 0.2443F, 0.1047F, 0.0F));

		PartDefinition cube_r286 = jaw.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(78, 14).addBox(-1.0F, -0.6667F, -1.8236F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0F, 1.0301F, -0.4419F, -0.1222F, 0.1047F, 0.0F));

		PartDefinition cube_r287 = jaw.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(7, 75).addBox(-1.0F, 0.9124F, 2.2253F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.0F, 1.0301F, -0.4419F, -2.7576F, 0.1047F, 0.0F));

		PartDefinition cube_r288 = jaw.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(35, 78).addBox(-1.0F, 2.1107F, -2.2324F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, 1.0301F, -0.4419F, -1.5184F, 0.1047F, 0.0F));

		PartDefinition cube_r289 = jaw.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(74, 88).addBox(-1.0F, 0.1801F, -3.0931F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0F, 1.0301F, -0.4419F, -0.8203F, 0.1047F, 0.0F));

		PartDefinition cube_r290 = jaw.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(78, 18).addBox(-1.0F, -0.4781F, -2.4584F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.0F, 1.0301F, -0.4419F, -0.5585F, 0.1047F, 0.0F));

		PartDefinition cube_r291 = jaw.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(78, 10).addBox(-0.7F, -0.8F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.7F, 0.4238F, -0.3029F, 0.0F, 0.4189F, 0.0F));

		return LayerDefinition.create(meshdefinition, 96, 96);
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